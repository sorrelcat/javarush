package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream(args[1]);
        FileOutputStream fos = new FileOutputStream(args[2]);

        if(args[0].equals("-e"))
        {
            int t;
            while(fis.available() > 0) {
                t = fis.read();
                fos.write(t);
                fos.write(0);
            }
        }
        else if (args[0].equals("-d")) {
            int t;
            while(fis.available() > 0) {
                t = fis.read();
                fos.write(t);
                fis.read();
            }
        }

        fis.close();
        fos.close();


    }

}
