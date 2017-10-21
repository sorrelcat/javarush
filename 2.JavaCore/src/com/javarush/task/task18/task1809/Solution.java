package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        /*String name1 = "e:/1.txt";
        String name2 = "e:/2.txt";*/
        reader.close();

        FileInputStream fis = new FileInputStream(name1);
        FileOutputStream fos = new FileOutputStream(name2);

        byte [] buffer = new byte[fis.available()];
        fis.read(buffer, 0 , fis.available());
        for (int i = buffer.length-1; i >= 0 ; i--) {
            fos.write(buffer[i]);
        }

        fis.close();
        fos.close();
    }
}
