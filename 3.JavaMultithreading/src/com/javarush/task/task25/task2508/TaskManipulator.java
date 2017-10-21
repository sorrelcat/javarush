package com.javarush.task.task25.task2508;

public class TaskManipulator implements Runnable, CustomThreadManipulator {

    public Thread thread;

    @Override
    public void run() {

        try {
            while (!thread.isInterrupted()) {
                Thread.sleep(0);
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            //System.out.println(e.getMessage());
        }
     //   2. Метод run должен каждые 100 миллисекунд выводить имя исполняемой нити в консоль.

    }

    @Override
    public void start(String threadName) {

        this.thread = new Thread(this);
        this.thread.setName(threadName);
        this.thread.start();

      //  4. Метод start должен создавать, сохранять во внутреннее поле и запускать нить с именем, которое передано через аргумент метода.


    }

    @Override
    public void stop() {

        thread.interrupt();

        //5. Метод stop должен прерывать последнюю созданную классом TaskManipulator нить.

    }
}
