package com.javarush.task.task19.task1914;

/* 
Решаем пример
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

        String result = baos.toString().replaceAll("[\\n|\\r]", "");
        String[] chunks = result.split(" ");
        int res = 0;
        switch (chunks[1]) {
            case "+":
                res = Integer.parseInt(chunks[0]) + Integer.parseInt(chunks[2]);
                break;
            case "-":
                res = Integer.parseInt(chunks[0]) - Integer.parseInt(chunks[2]);
                break;
            case "*":
                res = Integer.parseInt(chunks[0]) * Integer.parseInt(chunks[2]);
                break;
        }
        System.out.println(result + res);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

