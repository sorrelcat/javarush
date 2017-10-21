package com.javarush.task.task13.task1318;

import org.omg.CORBA.portable.InputStream;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fs = new FileInputStream(fileName);
        while (fs.available() > 0)
        {
            System.out.print((char)fs.read());
        }
        System.out.println();
        fs.close();
        reader.close();

    }
}