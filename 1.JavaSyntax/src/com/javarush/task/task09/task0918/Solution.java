package com.javarush.task.task09.task0918;

/* 
Все свои, даже исключения
*/

import java.io.FileNotFoundException;

public class Solution {
    public static void main(String[] args) {
    }
    
    static class MyException extends ClassNotFoundException {
    }

    static class MyException2 extends FileNotFoundException {
    }

    static class MyException3 extends RuntimeException{
    }

    static class MyException4 extends ArithmeticException{
    }
}

