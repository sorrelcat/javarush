package com.javarush.task.task39.task3909;


/*
Одно изменение
*/
public class Solution {
    public static void main(String[] args) {

    }

    public static boolean isOneEditAway(String first, String second) {
        if((first == null && second == null)
                || (first == null && second.length() == 1)
                || (second == null && first.length() == 1)
                || (first.length() == 0 && second.length() == 0)) return false;
        if((first.length() - second.length()) > 1 || (second.length() - first.length()) > 1) return false;
        if(first.equals(second)) return false;

        int minL = first.length() - second.length() > 0 ? second.length() : first.length();

        for (int i = 0; i < minL - 1; i++) {
            if(first.charAt(i) != second.charAt(i)) {
                if(first.substring(i+1).equals(second.substring(i+1))) return true;
                if(first.substring(i).equals(second.substring(i+1))) return true;
                if(first.substring(i+1).equals(second.substring(i))) return true;
                break;
            }
        }

        if(first.substring(0, minL-1).equals(second.substring(0, minL-1))) return true;

        return false;
    }
}
