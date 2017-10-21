package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        FileInputStream fr = new FileInputStream(name);
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        while (fr.available()> 0) {
            a.add(fr.read());
        }
        int t;
        for ( int q : a ) {
            if(!b.contains(q)) b.add(q);
        }
        for (int i = 0; i < b.size(); i++) {
            for (int j = i; j < b.size(); j++) {
                if (b.get(i) > b.get(j))
                {
                    t = b.get(i);
                    b.set(i, b.get(j));
                    b.set(j, t);
                }
            }

        }
        for (int i = 0; i < b.size(); i++)
        {
            System.out.print(b.get(i) + " ");
        }


        fr.close();
        reader.close();
    }
}
