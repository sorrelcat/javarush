package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();

        reader.close();
        FileInputStream fis = new FileInputStream(name1);
        FileOutputStream fos1 = new FileOutputStream(name2);
        FileOutputStream fos2 = new FileOutputStream(name3);

        int count = fis.available();
        byte[] buffer = new byte[count];

        if(count > 0) {
            fis.read(buffer);
            fos1.write(buffer, 0, count / 2 + count % 2);
            fos2.write(buffer, count / 2 + count % 2, count / 2);
        }

        fis.close();
        fos1.close();
        fos2.close();


    }
}
