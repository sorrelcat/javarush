package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public volatile static List<Person> allPeople = new ArrayList<Person>();
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    public static  SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        String param = "";
        if (args.length > 0) {
            param = args[0];
            if (param.equals("-c"))
            {
                if(args[2].equals("м")) allPeople.add(Person.createMale(args[1], sdf.parse(args[3])));
                else allPeople.add(Person.createFemale(args[1], sdf.parse(args[3])));
                System.out.println(allPeople.size()-1);
            }
            else if (param.equals("-u")) {
                Person two = allPeople.get(Integer.parseInt(args[1]));
                two.setName(args[2]);
                if (args[3].equals("м")) {
                    two.setSex(Sex.MALE);
                } else if (args[3].equals("ж")) {
                    two.setSex(Sex.FEMALE);}
                two.setBirthDay(sdf.parse(args[4]));
            }
            else if (param.equals("-d")) {
                Person three = new Person(null, null, null);
                allPeople.remove(Integer.parseInt(args[1]));
                allPeople.add(Integer.parseInt(args[1]), three);

            }
            else if (param.equals("-i")) {

                Person person = allPeople.get(Integer.parseInt(args[1]));
                if (person.getSex() == Sex.MALE) {
                    System.out.printf("%s %s %s%n", person.getName(), "м", sdf2.format(person.getBirthDay()));
                } else {
                    System.out.printf("%s %s %s%n", person.getName(), "ж", sdf2.format(person.getBirthDay()));
                }
            }

        }
    }
}
