package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fr = new FileReader(reader.readLine());
        reader.close();

        int k = 0;

        String line = "";
        while (fr.ready()) {
            line += (char)fr.read();
        }

        fr.close();

        line = line.replaceAll("[\\p{Punct}+|\\s]"," ");
        String[] lineArr = line.split(" ");
        for (int i = 0; i < lineArr.length; i++) {
            if (lineArr[i].equals("world")){
                k+=1;             }
        }

        System.out.println(k);


    }
}
