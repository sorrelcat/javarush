package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] array = new int [20];
        int maximum;
        int minimum;
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        maximum = array[0];
        minimum = maximum;

        for (int i = 1; i < 20; i++) {
            if(array[i] < minimum) minimum = array[i];
            if(array[i] > maximum) maximum = array[i];
        }
        //напишите тут ваш код

        System.out.println(maximum);
        System.out.println(minimum);
    }
}
