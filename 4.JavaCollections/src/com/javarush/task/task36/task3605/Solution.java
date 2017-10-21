package com.javarush.task.task36.task3605;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.TreeSet;

/* 
Использование TreeSet
*/
public class Solution {
    public static void main(String[] args) throws IOException {

        String fileName = args[0];
        //String fileName = "e:/1.txt";
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        TreeSet<Integer> treeSet = new TreeSet<>();
        while(reader.ready())
        {
            int t = reader.read();
            if(t >= 97 && t <= 122) {
                treeSet.add(t);
            }
            else if(t >= 65 && t <= 90) {
                treeSet.add(t + 32);
            }
        }
        reader.close();

        Iterator iterator = treeSet.iterator();
        int i = 0;
        while (iterator.hasNext() && i < 5) {
            int a = (Integer) iterator.next();
            System.out.print((char) a);
            i++;
        }
    }
}
