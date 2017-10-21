package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList();
        int count = 1, count_max = 1;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < 9; i++) {
            if (list.get(i) == list.get(i+1))
            {
                count++;
                if(count > count_max) {
                    count_max = count;
                }
            }
            else count = 1;
        }
        System.out.println(count_max);

    }
}