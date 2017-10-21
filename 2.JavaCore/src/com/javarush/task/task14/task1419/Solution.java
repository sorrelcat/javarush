package com.javarush.task.task14.task1419;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.net.MalformedURLException;
import java.nio.charset.MalformedInputException;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutionException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;
        }
        catch (ArithmeticException     e) {
            exceptions.add(e);
        }
        try {
            int [] p = new int[1];
            System.out.println(p[1]);
        }
        catch (IndexOutOfBoundsException  e) {
            exceptions.add(e);
        }
        try {
            throw new NullPointerException("null");
        }
        catch (NullPointerException   e) {
            exceptions.add(e);
        }
        try {
            throw new ClassCastException();
        }
        catch (ClassCastException    e) {
            exceptions.add(e);
        }
        try {
            throw new NoSuchElementException();
        }
        catch (NoSuchElementException    e) {
            exceptions.add(e);
        }
        try {
            throw new NegativeArraySizeException();
        }
        catch (NegativeArraySizeException    e) {
            exceptions.add(e);
        }
        try {
            throw new MalformedParameterizedTypeException();
        }
        catch (MalformedParameterizedTypeException e) {
            exceptions.add(e);
        }
        try {
            throw new ArrayStoreException();
        }
        catch (ArrayStoreException e) {
            exceptions.add(e);
        }
        try {
            throw new SecurityException();
        }
        catch (SecurityException    e) {
            exceptions.add(e);
        }
        try {
            throw new EmptyStackException();
        }
        catch (Exception e) {
            exceptions.add(e);
        }



        //напишите тут ваш код

    }

}
