package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        boolean flag = true;
        int sum = 0;
        String s;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (flag)
        {
            s = reader.readLine();
            if (s.equals("сумма"))
            {
                System.out.println(sum);
                flag = false;
            }
            else
            {
                sum += Integer.parseInt(s);
            }

        }

    }
}
