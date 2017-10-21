package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {

        try {
            BufferedReader fr = new BufferedReader(new FileReader(args[0]));
            FileWriter fw = new FileWriter(args[1]);

            /*BufferedReader fr = new BufferedReader(new FileReader("e:/1.txt"));
            FileWriter fw = new FileWriter("e:/2.txt");*/

            String line;
            int n = 0;
            try {
                while ((line = fr.readLine()) != null) {
                    line = line.replaceAll("\\n|\\r", " ");
                    String [] s = line.split(" ");

                    for (int i = 0; i < s.length; i++) {
                        if(s[i].length() > 6) {
                            n++;
                            if(n > 1) fw.write(",");
                            fw.write(s[i]);
                            //System.out.println(s[i]);
                        }
                    }
                }
                fr.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
