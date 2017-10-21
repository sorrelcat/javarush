package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        FileInputStream fr = new FileInputStream(name);
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        ArrayList<Integer> n = new ArrayList<Integer>();
        while (fr.available()> 0) {
            a.add(fr.read());
        }
        for ( int t : a ) {
            if(!b.contains(t)) b.add(t);
            n.add(0);
        }
        int max = 0;
        for (int i = 0; i < b.size(); i++) {
            for (int j = 0; j < a.size(); j++) {
                if(a.get(j) == b.get(i)) n.set(i, n.get(i)+1);

            }
            if(n.get(i) > max) max = n.get(i);
        }
        for (int i = 0; i < b.size(); i++)
             {
            if(n.get(i) == max) System.out.print(b.get(i) + " ");
        }


        fr.close();
        reader.close();
    }
}
