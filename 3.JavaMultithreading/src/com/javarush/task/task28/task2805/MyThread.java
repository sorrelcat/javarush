package com.javarush.task.task28.task2805;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by sorre on 10.09.2017.
 */
public class MyThread extends Thread {

    private static AtomicInteger threadPriority = new AtomicInteger(1);

    public MyThread() {
        this.setThreadPriority();
    }

    public MyThread(Runnable target) {
        super(target);
        this.setThreadPriority();

    }

    public MyThread(ThreadGroup group, Runnable target) {
        super(group, target);
        this.setThreadPriority(group);

    }

    public MyThread(String name) {
        super(name);
        this.setThreadPriority();

    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
        this.setThreadPriority(group);

    }

    public MyThread(Runnable target, String name) {
        super(target, name);
        this.setThreadPriority();

    }

    public MyThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
        this.setThreadPriority(group);

    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize) {
        super(group, target, name, stackSize);
        this.setThreadPriority(group);

    }

    public void setThreadPriority(ThreadGroup group) {
        this.setThreadPriority();
        if(this.getPriority() > group.getMaxPriority()) {
            this.setPriority(group.getMaxPriority());
        }
    }

    public void setThreadPriority() {
        this.setPriority(threadPriority.get());
        if(threadPriority.get() >= Thread.MAX_PRIORITY) {
            threadPriority.set(1);
        }
        else {
            threadPriority.incrementAndGet();
        }
    }
}
