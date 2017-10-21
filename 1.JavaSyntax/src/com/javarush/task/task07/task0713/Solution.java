package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list6 = new ArrayList<Integer>();
        String s;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            s = reader.readLine();
            list.add(i, Integer.parseInt(s));

        }
        for (int i = 0; i < 20; i++) {
            if (list.get(i) % 3 == 0) list3.add(list.get(i));
            if (list.get(i) % 2 == 0) list2.add(list.get(i));
            if (list.get(i) % 2 != 0 && list.get(i) % 3 != 0) list6.add(list.get(i));
        }
        printList(list3);
        printList(list2);
        printList(list6);

    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
