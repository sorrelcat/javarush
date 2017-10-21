package com.javarush.task.task39.task3910;

/* 
isPowerOfThree
*/
public class Solution {
    public static void main(String[] args) {
      System.out.println(isPowerOfThree(0));
        System.out.println(isPowerOfThree(4));
        System.out.println(isPowerOfThree(5));
        System.out.println(isPowerOfThree(79));
        System.out.println(isPowerOfThree(120));

    }

    public static boolean isPowerOfThree(int n) {
        if(n == 0) return false;
        if(n == 1) return true;
        if(n % 3 != 0) return false;
        return (isPowerOfThree(n/3));
    }
}
