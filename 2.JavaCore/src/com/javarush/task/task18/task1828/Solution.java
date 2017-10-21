package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        reader.close();

            if (args[0].equals("-d")) {

                BufferedReader fileReader = new BufferedReader(new FileReader(name));
                String line;
                ArrayList<String> list = new ArrayList<>();

                while ((line = fileReader.readLine()) != null) {
                    list.add(line);
                }

                for (int i = 0; i < list.size(); i++) {

                    if (Integer.parseInt(list.get(i).substring(0, 8).trim()) == Integer.parseInt(args[1]))
                    {
                        list.remove(i);
                    }
                }

                FileOutputStream fos = new FileOutputStream(name);
                for (String s : list) {
                    fos.write((String.format("%s%n", s)).getBytes());
                }
                fos.close();
                fileReader.close();

            }

            else if (args[0].equals("-u")) {

                BufferedReader fileReader = new BufferedReader(new FileReader(name));
                String line;
                ArrayList<String> list = new ArrayList<>();

                while ((line = fileReader.readLine()) != null) {
                    if (line.substring(0, 8).trim().equals(args[1])) {
                        if ("-u".equals(args[0])) {
                            list.add(String.format("%-8s%-30s%-8s%-4s", args[1], args[2], args[3], args[4]));
                        }
                    } else {
                        list.add(line);
                    }
                }

                FileOutputStream fos = new FileOutputStream(name);
                for (String s : list) {
                    fos.write((String.format("%s%n", s)).getBytes());
                }
                fos.close();
                fileReader.close();

            }

    }
}
