package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(args[0]);

        int other = 0;
        int space = 0;

        while (fileInputStream.available() > 0){
            int tmp = fileInputStream.read();
            other++;
            if (tmp == (byte)' ') space++;

        }
        fileInputStream.close();
        double d = (double) space/other * 100;
        System.out.println(String.format("%.2f",d));

    }
}
