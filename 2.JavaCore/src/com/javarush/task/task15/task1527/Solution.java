package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        ArrayList<String> list = new ArrayList<String>();

        s = s.substring(s.indexOf('?') + 1);
        String temp = "";
        for (String retval : s.split("&")) {
            if(retval.startsWith("obj"))
            {
                temp = retval.substring(4);
            }
            if(retval.contains("=")) list.add(retval.substring(0, retval.indexOf("=")));
            else list.add(retval);
        }

        for (String t : list
             ) {
            System.out.print(t + " ");

        }
        System.out.println();
        if (!temp.equals(""))
        try {
            alert(Double.parseDouble(temp));
        }
        catch(Exception e)
        {
            alert(temp);
        }

        //add your code here
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }

}
