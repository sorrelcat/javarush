package com.javarush.task.task19.task1913;

/* 
Выводим только цифры
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {



        PrintStream ps = System.out;

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(baos);
        System.setOut(stream);

        testString.printSomething();
        System.setOut(ps);

        String result = baos.toString();
        result = result.replaceAll("\\p{Punct}", "");
        result = result.replaceAll("\\p{Alpha}", "");
        result = result.replaceAll("\\p{Space}", "");
        result = result.replaceAll("\\p{Cntrl}", "");
        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
