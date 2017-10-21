package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

       FileInputStream fis = new FileInputStream(args[0]);
        //FileInputStream fis = new FileInputStream("e:/1.txt");

        int[][] a = new int[2][128];


        while(fis.available() > 0)
        {
            a[1][fis.read()]++;
        }
        for (int i = 0; i < 128; i++) { a[0][i] = i;
        }

        /*int n = 0, zn = 0;

        for (int i = 127; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[1][j] > a[1][j+1])
                {
                    n = a[0][j];
                    a[0][j] = a[0][j+1];
                    a[0][j+1] = n;
                    zn = a[1][j];
                    a[1][j] = a[1][j+1];
                    a[1][j+1] = zn;
                }
            }
        }*/

        for (int i = 0; i < 128; i++) {

            if(a[1][i] > 0)
            System.out.println((char)a[0][i] + " " + a[1][i]);
        }

        fis.close();

    }
}
