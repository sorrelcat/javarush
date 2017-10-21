package com.javarush.task.task23.task2305;

/* 
Inner
*/
public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions() {

        Solution [] dbl = new Solution[2];
        dbl[0] = new Solution();
        Solution sol = new Solution();
        dbl[0].innerClasses[0] = sol.new InnerClass();
        dbl[0].innerClasses[1] = sol.new InnerClass();
        dbl[1] = new Solution();
        dbl[1].innerClasses[0] = sol.new InnerClass();
        dbl[1].innerClasses[1] = sol.new InnerClass();
        return dbl;
    }

    public static void main(String[] args) {

    }

}
