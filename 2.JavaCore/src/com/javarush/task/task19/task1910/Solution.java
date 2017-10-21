package com.javarush.task.task19.task1910;

/* 
Пунктуация
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

        String line = "";

        BufferedReader fr = new BufferedReader(new FileReader(name1));
        BufferedWriter fw = new BufferedWriter(new FileWriter(name2));

        while (fr.ready()) {
            line += (char) fr.read();
        }

        fr.close();

        line = line.replaceAll("\\p{Punct}", "");
        line = line.replaceAll("\n", "");
        //System.out.println(line);
        for (int i = 0; i < line.length(); i++) {
            fw.write(line.charAt(i));
        }

        fw.close();
    }
}
