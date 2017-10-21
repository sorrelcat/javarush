package com.javarush.task.task18.task1823;

import java.io.*;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = "";
        while (!name.equals("exit") ) {
            name = reader.readLine();
            if(!name.equals("") && !name.equals("exit")) {
                ReadThread thread = new ReadThread(name);
                thread.start();
            }
        }
        reader.close();

    }

    public static class ReadThread extends Thread {
        public ReadThread(String fileName) throws IOException {

            FileInputStream fis = new FileInputStream(fileName);
            byte [] bytes = new byte[128];
            while(fis.available() > 0) {
                bytes[fis.read()]++;
            }
            fis.close();
            int max = 0;
            for (int i = 1; i < 128; i++) {
                if(bytes[i] > bytes[max]) max = i;
            }
            resultMap.put(fileName, max);

            //implement constructor body
        }
        // implement file reading here - реализуйте чтение из файла тут
    }
}
