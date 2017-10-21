package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[0]);

        int n = 0;
        while(fis.available() > 0) {
            int k = fis.read();
            if((k >= 65 && k <= 90) || (k >= 97 && k <= 122)) n++;
        }

        System.out.println(n);

        fis.close();
    }
}
