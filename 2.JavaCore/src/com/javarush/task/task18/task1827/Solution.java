package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        reader.close();

        if(args[0].equals("-c")) {

        /*String name = "e:/1.txt";
        if(true) {*/


            BufferedReader fileReader = new BufferedReader(new FileReader(name));
            String line;
            int maxId = 0;
            ArrayList<String> list = new ArrayList<>();

            while ((line = fileReader.readLine()) != null) {
                list.add(line);

                if (maxId < Integer.parseInt(line.substring(0, 8).trim())) {
                    maxId = Integer.parseInt(line.substring(0, 8).trim());
                }
            }

            FileOutputStream fos = new FileOutputStream(name);
            for (String s : list) {
                    fos.write((String.format("%s%n", s)).getBytes());
                }
                fos.write(String.format("%-8s%-30s%-8s%-4s%n", ++maxId, args[1], args[2], args[3]).getBytes());
            fos.close();
            fileReader.close();

        }
//
//        id — 8 символов.
//                productName — название товара, 30 chars (60 bytes).
//                price — цена, 8 символов.
//                quantity — количество, 4 символа.
    }


}
