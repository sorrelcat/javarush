package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {

        String result = null;
        if (string == null || string.length() < 5) throw new TooShortStringException();
        else {
            int spaces = 0;
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == ' ') spaces++;
            }
            if (spaces < 4) {
                throw new TooShortStringException();
            } else {
                String s[] = string.split(" ");
                if (s.length<5)
                    throw new TooShortStringException();

                return s[1] + " " + s[2] + " " + s[3] + " " + s[4];
            }
        }
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
