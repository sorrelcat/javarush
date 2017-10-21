package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {

        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }


        @Override
        public Person read() throws IOException {

            // должен читать строку с файла, парсить её, и возвращать данные только одного человека, в виде объекта класса Person.

            SimpleDateFormat sdFormat = new SimpleDateFormat("ddMMyyyy");

            String lastName = fileScanner.next();
            String firstName = fileScanner.next();
            String middleName = fileScanner.next();
            Date birthDate = null;
            try {
                birthDate = sdFormat.parse(fileScanner.next() + fileScanner.next() + fileScanner.next());
            }
            catch (ParseException e) {}

            return new Person(firstName, middleName, lastName, birthDate);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
