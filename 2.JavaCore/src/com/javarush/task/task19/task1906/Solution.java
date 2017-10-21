package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        reader.close();

        FileReader fr = new FileReader(name1);
        FileWriter fw = new FileWriter(name2);

        while (fr.ready()) {
            fr.read();
            int c = fr.read();
            fw.write(c);
        }

        fr.close();
        fw.close();
    }
}
