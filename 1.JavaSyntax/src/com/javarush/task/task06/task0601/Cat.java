package com.javarush.task.task06.task0601;

/* 
Метод finalize класса Cat
*/

public class Cat {
    //напишите тут ваш код

    protected void finalize() throws Throwable
    {
        System.out.println("in finalize");
    }
    public static void main(String[] args) {

    }
}
