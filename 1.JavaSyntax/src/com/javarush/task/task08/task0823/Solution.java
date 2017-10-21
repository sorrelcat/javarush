package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        String[] sArr = s.split("\\b");
        String tmp;
        s = "";
        for (int i = 0; i < sArr.length; i++) {
            tmp = sArr[i].substring(0,1).toUpperCase() + sArr[i].substring(1);
            s += tmp + (i == sArr.length - 1 ? "" : " ");
        }
        System.out.println(s);
    }
}
