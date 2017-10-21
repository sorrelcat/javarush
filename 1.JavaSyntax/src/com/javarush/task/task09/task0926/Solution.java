package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        int [] one = new int[5];
        for (int i = 0; i < 5; i++) {
            one[i] = i;
        }
        int [] two = new int[2];
        for (int i = 0; i < 2; i++) {
            two[i] = i;
        }
        int [] three = new int[4];
        for (int i = 0; i < 4; i++) {
            three[i] = i;
        }
        int [] four = new int[7];
        for (int i = 0; i < 7; i++) {
            four[i] = i;
        }
        int [] five = new int[0];

        ArrayList<int[]> a = new ArrayList<int[]>();

        a.add(one);
        a.add(two);
        a.add(three);
        a.add(four);
        a.add(five);

        return a;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
