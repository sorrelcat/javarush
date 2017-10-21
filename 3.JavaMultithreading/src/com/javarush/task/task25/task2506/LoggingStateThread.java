package com.javarush.task.task25.task2506;

/**
 * Created by sorre on 24.08.2017.
 */
public class LoggingStateThread extends Thread {
    Thread thread;
    State state;

    public LoggingStateThread(Thread t) {
        this.thread = t;
        this.state = t.getState();
    }

    public void run() {
        System.out.println(state);
        while(state != State.TERMINATED) {
            if(thread.getState() != state) {
                state = thread.getState();
                System.out.println(state);
            }
        }
        if(thread.isInterrupted()) {
            this.interrupt();
        }
    }
}
