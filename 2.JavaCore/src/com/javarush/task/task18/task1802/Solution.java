package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        FileInputStream fr = new FileInputStream(name);
        int i = fr.read();
        int min = i;
        while(fr.available() > 0)
        {
            i = fr.read();
            if (min > i) min = i;
        }
        fr.close();
        reader.close();
        System.out.println(min);
    }
}
