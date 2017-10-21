package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = "";
        boolean t = true;

        while (t) {
            try {
                name = reader.readLine();
                FileInputStream fis = new FileInputStream(name);
                fis.close();
            } catch (FileNotFoundException e) {
                System.out.println(name);
                reader.close();
                t = false;
            }
        }
    }
}
