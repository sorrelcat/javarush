package com.javarush.task.task32.task3210;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args)  {

        String fileName = args[0];
        int number = Integer.parseInt(args[1]);
        String text = args[2];

        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new RandomAccessFile(fileName, "rw");
            randomAccessFile.seek(number);
            byte [] bytesFromFile = new byte[text.length()];
            randomAccessFile.read(bytesFromFile, 0, text.length());
            randomAccessFile.seek(randomAccessFile.length());
            randomAccessFile.write(convertByteToString(bytesFromFile).equals(text) ? "true".getBytes() : "false".getBytes());
            randomAccessFile.close();


        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }







    }

    public static String convertByteToString(byte readBytes[])
    {
        return new String(readBytes);
    }
}

