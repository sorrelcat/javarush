package com.javarush.task.task26.task2611;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by sorre on 28.08.2017.
 */
public class Producer implements Runnable {

    private ConcurrentHashMap<String, String> map;

    @Override
    public void run() {
        try {
            int i = 1;
            while (true) {
                map.put(Integer.toString(i), "Some text for " + i++);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(String.format("[%s] thread was terminated", Thread.currentThread().getName()));
        }
    }

    public Producer(ConcurrentHashMap<String, String> map) {
        this.map = map;
    }

}
