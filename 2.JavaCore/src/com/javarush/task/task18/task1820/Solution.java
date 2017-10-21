package com.javarush.task.task18.task1820;

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        String name1;
        String name2;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        name1 = reader.readLine();
        name2 = reader.readLine();

        FileInputStream fis = new FileInputStream(name1);
        FileOutputStream fos = new FileOutputStream(name2);

        byte[] bt = new byte[fis.available()];
        fis.read(bt);
        fis.close();
        String[] numbers = new String(bt).split(" ");
        String line = "";

        for (String s : numbers){
            line += Math.round(Double.parseDouble(s)) + " ";
        }
        fos.write(line.trim().getBytes());
        fos.close();


        /* Программа должна два раза считать имена файлов с консоли.
        2. Для первого файла создай поток для чтения. Для второго - поток для записи.
        3. Считать числа из первого файла, округлить их и записать через пробел во второй.
        4. Должны соблюдаться принципы округления, указанные в задании.
        5. Созданные для файлов потоки должны быть закрыты.*/

    }
}