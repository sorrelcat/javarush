package com.javarush.task.task08.task0813;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static HashSet<String> createSet() {
        //напишите тут ваш код
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < 20; i++) {
            Random r = new Random();
            set.add("Л" + r);
        }
        return set;
    }

    public static void main(String[] args) {

    }
}
