package com.javarush.task.task39.task3908;


/*
Возможен ли палиндром?
*/
public class Solution {
    public static void main(String[] args) {

    }

    public static boolean isPalindromePermutation(String s) {

        char [] chars = s.toLowerCase().toCharArray();
        int changes = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if(chars[i] == chars[j]) {
                    chars[i] = ' ';
                    chars[j] = ' ';
                    break;
                }
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if(chars[i] == ' ') changes++;
        }

        return changes >= s.length() - 1 ? true : false;
    }
}
