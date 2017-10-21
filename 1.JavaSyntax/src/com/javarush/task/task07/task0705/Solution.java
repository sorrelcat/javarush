package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int list [] = new int[20];
        int list1 [] = new int[10];
        int list2 [] = new int[10];

        for (int i = 0; i < 20; i++) {
            s = reader.readLine();
            list[i] = Integer.parseInt(s);;
        }
        for (int i = 0; i < 10; i++) {
            list1[i] = list[i];
            list2[i] = list[10+i];
            System.out.println(list2[i]);
        }
    }
}
