package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[20];

        String s;

        for (int i = 0; i < list.length; i++)
        {
            s = reader.readLine();
            list[i] = Integer.parseInt(s);
        }

        return list;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int maximal = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximal) maximal = array[i];
        }
        return maximal;
    }
}
