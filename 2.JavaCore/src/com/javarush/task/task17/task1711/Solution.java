package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    public static  SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут

        if (args.length > 0) {
            switch (args[0]) {
                case "-c": {
                    // -c name1 sex1 bd1 name2 sex2 bd2 ...
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i += 3) {
                            if (args[i + 1].equals("м")) {
                                allPeople.add(Person.createMale(args[i], sdf.parse(args[i + 2])));
                            } else {
                                allPeople.add(Person.createFemale(args[i], sdf.parse(args[i + 2])));
                            }
                            System.out.println(allPeople.size() - 1);
                        }

                    }
                    break;
                }
                //-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
                case "-u": {
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i += 4) {
                            Person two = allPeople.get(Integer.parseInt(args[i]));
                            two.setName(args[i + 1]);
                            if (args[i + 2].equals("м")) {
                                two.setSex(Sex.MALE);
                            } else if (args[i + 2].equals("ж")) {
                                two.setSex(Sex.FEMALE);
                            }
                            two.setBirthDay(sdf.parse(args[i + 3]));
                        }
                    }
                    break;
                }
                // -d id1 id2 id3 id4 ...
                case "-d": {
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            Person three = new Person(null, null, null);
                            allPeople.remove(Integer.parseInt(args[i]));
                            allPeople.add(Integer.parseInt(args[i]), three);
                        }
                    }
                    break;
                }
                case "-i": {
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            Person person = allPeople.get(Integer.parseInt(args[i]));
                            if (person.getSex() == Sex.MALE) {
                                System.out.printf("%s %s %s%n", person.getName(), "м", sdf2.format(person.getBirthDay()));
                            } else {
                                System.out.printf("%s %s %s%n", person.getName(), "ж", sdf2.format(person.getBirthDay()));
                            }
                        }
                    }
                    break;
                }
            }
        }
    }
}
