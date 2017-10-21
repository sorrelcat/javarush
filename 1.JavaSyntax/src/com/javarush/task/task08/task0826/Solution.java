package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Пять победителей
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        boolean change = true;
        int temp = 0;
        while(change){
            change = false;
            for(int i=1; i < array.length; i++){
                if(array[i-1] < array[i]){
                    temp = array[i-1];
                    array[i-1] = array[i];
                    array[i] = temp;
                    change = true;
                }
            }
        }
    }
}
