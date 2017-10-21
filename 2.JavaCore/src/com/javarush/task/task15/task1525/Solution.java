package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();
    static {
        try {
            //Объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader(Statics.FILE_NAME));
            try {
                String s;
                while ((s = in.readLine()) != null) {
                    lines.add(s);
                }
            } finally {
                in.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
