package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader freader = new BufferedReader(new FileReader(args[0]));

        //BufferedReader freader = new BufferedReader(new FileReader("e:/1.txt"));

        ArrayList<String> list = new ArrayList<String>();

        while (freader.ready()) {
            String q = freader.readLine();
            if (!q.equals("")) list.add(q);
        }
        freader.close();

        Collections.sort(list);


        ArrayList<String> stringList = new ArrayList<String>();
        ArrayList<Double> doubleList = new ArrayList<Double>();

        String [] temp = list.get(0).split(" ");
        stringList.add(temp[0]);
        doubleList.add(Double.parseDouble(temp[1]));

        int sli = 0;

        for (int i = 1; i < list.size(); i++) {
            String [] t = list.get(i).split(" ");
            if(t[0].equals(stringList.get(sli))) {
                doubleList.set(sli, doubleList.get(sli) + Double.parseDouble(t[1]));
            }
            else {
                stringList.add(t[0]);
                doubleList.add(Double.parseDouble(t[1]));
                sli++;
            }
        }

        Double max = doubleList.get(0);

        for (int i = 1; i < doubleList.size(); i++) {
            if(doubleList.get(i) > max) {
                max = doubleList.get(i);
            }
        }

        for (int i = 0; i < stringList.size(); i++) {

            if(doubleList.get(i).compareTo(max) != -1) {
                System.out.println(stringList.get(i));
            }
        }
    }
}
