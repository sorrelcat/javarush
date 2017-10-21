package com.javarush.task.task32.task3202;

import java.io.*;
import java.util.Scanner;

/* 
Читаем из потока
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        StringWriter writer = getAllDataFromInputStream(new FileInputStream("testFile.log"));
        System.out.println(writer.toString());
    }

    public static StringWriter getAllDataFromInputStream(InputStream is)  {

        try {
            Scanner s = new Scanner(is).useDelimiter("\\A");
            String result = s.hasNext() ? s.next() : "";
            StringWriter sw = new StringWriter();
            sw.write(result);
            return sw;
        }
        catch (Exception e) {
            return new StringWriter();

        }

    }
}

