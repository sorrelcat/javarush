package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            BufferedReader fr = new BufferedReader(new FileReader(reader.readLine()));
            reader.close();
            String line;
            while ((line = fr.readLine()) != null)
            {
                System.out.println(new StringBuffer(line).reverse().toString());
            }
            fr.close();
        }
        catch (Exception e) {}
    }
}
