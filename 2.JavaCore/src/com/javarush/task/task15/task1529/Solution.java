package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    


    public static Flyable result;

    static {
        //add your code here - добавьте код тут
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void reset() throws IOException {
        //add your code here - добавьте код тут

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        if(s.equals("helicopter")) result = new Helicopter();
        else if(s.equals("plane"))
        {
            s = reader.readLine();
            try {
                Integer i = Integer.parseInt(s);
                result = new Plane(i);
            }
            catch (Exception e) {}
        }

        reader.close();

    }
}
