package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int list [] = new int[15];
        int even = 0, odd = 0;

        for (int i = 0; i < 15; i++) {
            s = reader.readLine();
            list[i] = Integer.parseInt(s);
            if (i % 2 == 0) even += list[i];
            else odd += list[i];
        }
        if (even > odd) System.out.println("В домах с четными номерами проживает больше жителей.");
        else System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
