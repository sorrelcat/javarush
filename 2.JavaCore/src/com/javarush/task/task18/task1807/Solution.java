package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        FileInputStream fs = new FileInputStream(name);
        int n = 0;
        while(fs.available() > 0)
        {
            if(fs.read() == 44) n++;
        }
        reader.close();
        fs.close();
        System.out.println(n);
    }
}
