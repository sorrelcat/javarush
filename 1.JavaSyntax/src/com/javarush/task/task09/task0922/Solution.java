package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        SimpleDateFormat dateFormat1 = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);

        Date date = new Date();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        date = dateFormat1.parse(reader.readLine());
        System.out.println(dateFormat2.format(date).toUpperCase());
    }
}
