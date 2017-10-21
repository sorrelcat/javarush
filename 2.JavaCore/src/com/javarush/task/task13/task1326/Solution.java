package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> odd = new ArrayList<Integer>();
        Scanner in = new Scanner(new FileInputStream(reader.readLine()));
        int a;
        String s;
        while (in.hasNextInt())
        {

            a =  in.nextInt();
            if(a % 2 == 0) odd.add(a);
        }
        in.close();
        reader.close();
        int ar [] = new int[odd.size()];
        for (int i = 0; i < odd.size(); i++) {
            ar[i] = odd.get(i);
        }
        for (int i = 0; i < odd.size() - 1; i++) {
            for (int j = i; j < odd.size(); j++) {
                if(ar[i] > ar[j])
                {
                    a = ar[i];
                    ar[i] = ar[j];
                    ar[j] = a;
                }
            }
        }
        for (int i = 0; i < odd.size(); i++) {
           System.out.println(ar[i]);

        }
    }
}
