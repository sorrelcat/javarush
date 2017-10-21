package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String list1 [] = new String[10];
        int list2 [] = new int[10];

        for (int i = 0; i < 10; i++) {
            list1[i] = reader.readLine();
            list2[i] = list1[i].length();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(list2[i]);
        }
    }
}
