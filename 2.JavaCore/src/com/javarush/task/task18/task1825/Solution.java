package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> filenames = new ArrayList<String>();
        String s = reader.readLine();
        while (!s.equals("end")) {
            filenames.add(s);
            s = reader.readLine();
        }
        s = filenames.get(0);
        String [] q = s.split(".part", 2);

        File file = new File(q[0]);
        FileOutputStream fos = new FileOutputStream(q[0]);

        Collections.sort(filenames);

        for (String temp: filenames
             ) {
            FileInputStream fis = new FileInputStream(temp);
            byte [] bytes = new byte[100];
            int readed = 0;
            while(fis.available() > 0)
            {
                readed = fis.read(bytes);
                fos.write(bytes, 0, readed);
            }

            fis.close();
        }
        fos.close();


    }
}
