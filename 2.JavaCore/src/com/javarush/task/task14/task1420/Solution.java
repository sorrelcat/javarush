package com.javarush.task.task14.task1420;

/* 
НОД
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        if (a <= 0 ) throw new Exception();
        else if (b <= 0 ) throw new Exception();
        else System.out.println(nod(a, b));

    }

    public static int nod(int a, int b) {

        int c = 0;
        for (int i = 1; i <= (a > b ? a : b); i++) {
            if (a % i == 0 && b % i == 0) c = i;
        }
        return c;
    }


}
