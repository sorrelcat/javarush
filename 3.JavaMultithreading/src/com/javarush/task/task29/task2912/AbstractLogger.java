package com.javarush.task.task29.task2912;

/**
 * Created by sorre on 15.09.2017.
 */
public abstract class AbstractLogger implements Logger{

    Logger next;
    int level;

    AbstractLogger (int level) {
        this.level = level;
    }

    @Override
    public void setNext(Logger next) {
        this.next = next;
    }

    @Override
    public void inform(String message, int level) {
        if (this.level <= level) {
            info(message);
        }
        if (next != null) {
            next.inform(message, level);
        }
    }
}
