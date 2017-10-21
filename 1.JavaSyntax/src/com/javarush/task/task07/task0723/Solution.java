package com.javarush.task.task07.task0723;

/* 
Обратный отсчёт
*/

import java.lang.InterruptedException;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 30; i >= 0; i--) {
            try {
                System.out.println(i);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("FCUK");
            }
            //напишите тут ваш код
        }

        System.out.println("Бум!");
    }
}
