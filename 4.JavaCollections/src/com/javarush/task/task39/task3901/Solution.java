package com.javarush.task.task39.task3901;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* 
Уникальные подстроки
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please input your string: ");
        String s = bufferedReader.readLine();

        System.out.println("The longest unique substring length is: \n" + lengthOfLongestUniqueSubstring(s));
    }

    public static int lengthOfLongestUniqueSubstring(String s) {

        if(s == null || s.length() == 0) return 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            List<Character> list = new ArrayList<Character>();
            for (int j = i; j < s.length(); j++) {
                if(!list.contains(s.charAt(j))) list.add(s.charAt(j));
                else break;
            }
            if(result < list.size()) result = list.size();
        }
        return result;
    }
}
