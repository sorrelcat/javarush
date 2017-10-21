package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        reader.close();

        BufferedReader fr = new BufferedReader(new FileReader(name1));
        String line="";

        BufferedWriter fw = new BufferedWriter(new FileWriter(name2));

        while ((line = fr.readLine()) != null) {
            for (String chunk : line.split(" ")) {
                try {
                    fw.write(Integer.parseInt(chunk) + " ");
                } catch (NumberFormatException e) {
                }
            }
        }
        fr.close();
        fw.close();

    }
}
