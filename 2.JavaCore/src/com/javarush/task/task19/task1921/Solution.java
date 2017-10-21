package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        try (FileReader fileReader = new FileReader(args[0])) {
            BufferedReader fReader = new BufferedReader(fileReader);

            PEOPLE.addAll(fReader.lines()
                    .map(s -> s.split(" "))
                    .map(p -> {
                        int year = Integer.parseInt(p[p.length - 1]);
                        int month = Integer.parseInt(p[p.length - 2]) - 1;
                        int date = Integer.parseInt(p[p.length - 3]);

                        String fio = Arrays.stream(p)
                                .limit(p.length - 3)
                                .reduce((v1, v2) -> v1 + " " + v2).orElse("");
                        return new Person(fio, new GregorianCalendar(year, month, date).getTime());
                    })
                    .collect(Collectors.toList()));
            }
        }
}
