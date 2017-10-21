package com.javarush.task.task14.task1421;

/**
 * Created by sorre on 02.07.2017.
 */
public class Singleton {

    private static final Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }

    private Singleton() {}
}
