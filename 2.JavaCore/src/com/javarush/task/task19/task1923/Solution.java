package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader fr = new BufferedReader(new FileReader(args[0]));
            BufferedWriter fw = new BufferedWriter(new FileWriter(args[1]));

            /*BufferedReader fr = new BufferedReader(new FileReader("e:/1.txt"));
            BufferedWriter fw = new BufferedWriter(new FileWriter("e:/2.txt"));*/

            String line;
            try {
                while ((line = fr.readLine()) != null) {
                    String [] s = line.split(" ");
                    for (int i = 0; i < s.length; i++) {
                        if(s[i].matches("^.*\\d.*$")) {
                            fw.write(s[i]);
                            fw.write(" ");
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
