package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        FileInputStream fr = new FileInputStream(name1);

        ArrayList<Integer> a = new ArrayList<Integer>();
        while(fr.available() > 0) a.add(fr.read());

        FileOutputStream fw1 = new FileOutputStream(name1);
        FileInputStream fr1 = new FileInputStream(name2);

        while (fr1.available() > 0) fw1.write(fr1.read());
        for (int temp : a
             ) {
            fw1.write(temp);
        }

        fr.close();
        fw1.close();
        fr1.close();
    }
}
