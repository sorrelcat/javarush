package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int list [] = new int[10];

        for (int i = 9; i >=0; i--) {
            s = reader.readLine();
            list[i] = Integer.parseInt(s);;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(list[i]);
        }
    }
}

