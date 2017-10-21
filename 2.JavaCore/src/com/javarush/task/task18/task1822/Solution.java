package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        reader.close();
        FileInputStream fis = new FileInputStream(name);
        byte [] bytes = new byte[fis.available()];
        while(fis.available() > 0) fis.read(bytes);
        fis.close();

        String [] s = new String(bytes).split("\n");
        for (String temp : s
             ) {
            String [] t = new String(temp).split(" ");
            if(t[0].equals(args[0])) System.out.println(temp);

        }

    }
}
