package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        ArrayList<Character> one = new ArrayList<Character>();
        ArrayList<Character> two = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i)))
            {
                one.add(s.charAt(i));
                one.add(' ');
            }
            else
                if (s.charAt(i) != ' ')
                {
                    two.add(s.charAt(i));
                    two.add(' ');
                }
        }
        for(char a : one) System.out.print(a);
        System.out.println();
        for(char a : two) System.out.print(a);

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}