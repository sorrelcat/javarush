package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();
        /*String name1 = "e:/1.txt";
        String name2 = "e:/2.txt";
        String name3 = "e:/3.txt";*/
        FileOutputStream fw = new FileOutputStream(name1);
        FileInputStream fr1 = new FileInputStream(name2);
        FileInputStream fr2 = new FileInputStream(name3);
        while(fr1.available() > 0) {
            fw.write(fr1.read());
        }
        while(fr2.available() > 0) {
            fw.write(fr2.read());
        }
        fw.close();
        fr1.close();
        fr2.close();
    }
}
