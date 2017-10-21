package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        FileInputStream fr = new FileInputStream(name);
        int i = fr.read();
        int max = i;
        while(fr.available() > 0)
        {
            i = fr.read();
            if (max < i) max = i;
        }
        fr.close();
        reader.close();
        System.out.println(max);
    }
}
