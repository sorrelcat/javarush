package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(i, reader.readLine());
        }

        int min = list.get(0).length();
        int max = list.get(0).length();
        int nmin = 0, nmax = 0;

        for (int i = 1; i < 10; i++) {
            if (list.get(i).length() > max)
            {
                max = list.get(i).length();
                nmax = i;
            }
            if (list.get(i).length() < min)
            {
                min = list.get(i).length();
                nmin = i;
            }
        }

        if (nmin < nmax) System.out.println(list.get(nmin));
        else System.out.println(list.get(nmax));

    }
}
