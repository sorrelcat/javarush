package com.javarush.task.task25.task2505;

import java.util.Formatter;

/*
Без дураков
*/
public class Solution {

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new Solution().new MyThread("super secret key");
        myThread.start();
    }

    public class MyThread extends Thread {
        private String secretKey;

        public MyThread(String secretKey) throws InterruptedException {
            this.secretKey = secretKey;
            setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
            setDaemon(false);
        }

        @Override
        public void run() {
            throw new NullPointerException("it's an example");
        }

        private class MyUncaughtExceptionHandler extends Exception implements UncaughtExceptionHandler {
            public MyUncaughtExceptionHandler() {

            }

            @Override
            public void uncaughtException(Thread t, Throwable e) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }

                String f = String.format("%s, %s, %s", secretKey, t.getName(), e.getMessage());
                System.out.println(f);

            }
        }
    }

}

