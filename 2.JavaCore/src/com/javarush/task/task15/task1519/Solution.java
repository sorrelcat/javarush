package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        while (!s.equals("exit"))
        {
            if (s.contains(".")) try {
                print(Double.parseDouble(s));
            }
            catch (NumberFormatException e1) { print(s); }
            else try {
                int i = Integer.parseInt(s);
                if (i > 0 && i < 128 ) print((short)i);
                else if (i <= 0 || i >= 128 ) print(i);
                else print(s);
            }
            catch (NumberFormatException e2) { print(s); }
            s = reader.readLine();
        }

    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
