package com.javarush.task.task28.task2802;


import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* 
Пишем свою ThreadFactory
*/
public class Solution {

    private static volatile AtomicInteger fabricNumber = new AtomicInteger();

    public static void main(String[] args) {
        class EmulateThreadFactoryTask implements Runnable {
            @Override
            public void run() {
                emulateThreadFactory();
            }
        }

        ThreadGroup group = new ThreadGroup("firstGroup");
        Thread thread = new Thread(group, new EmulateThreadFactoryTask());

        ThreadGroup group2 = new ThreadGroup("secondGroup");
        Thread thread2 = new Thread(group2, new EmulateThreadFactoryTask());

        thread.start();
        thread2.start();
    }

    private static void emulateThreadFactory() {
        AmigoThreadFactory factory = new AmigoThreadFactory();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        factory.newThread(r).start();
        factory.newThread(r).start();
        factory.newThread(r).start();
    }

    public static class AmigoThreadFactory implements ThreadFactory {

        private AtomicInteger threadNumber = new AtomicInteger();
        @Override
        public Thread newThread(Runnable r) {

            Thread newThread = new Thread();
            threadNumber.incrementAndGet();

            newThread.setDaemon(false);
            newThread.setPriority(Thread.NORM_PRIORITY);
            newThread.setName(String.format("%s-pool-%d-thread-%d", newThread.getThreadGroup().getName(), fabricNumber.get(), threadNumber.get()));
            System.out.println(newThread.getName());
            return newThread;
        }

        public AmigoThreadFactory() {

            fabricNumber.incrementAndGet();
        }

    }
}
