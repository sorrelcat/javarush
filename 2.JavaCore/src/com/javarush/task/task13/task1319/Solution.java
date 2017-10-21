package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        String flag = "";
        while (!flag.equals("exit"))
        {
            flag = reader.readLine();
            bw.write(flag);
            bw.newLine();
        }
        System.out.println();
        bw.close();
        reader.close();
    }
}
