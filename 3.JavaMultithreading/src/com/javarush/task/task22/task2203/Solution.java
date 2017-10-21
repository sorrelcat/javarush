package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {

        if(string == null || string.indexOf("\t") < 0 || string.indexOf("\t") == string.lastIndexOf("\t")) throw new TooShortStringException();
        else {
            String[] s = string.split("\t");
            return s[1];
        }
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
