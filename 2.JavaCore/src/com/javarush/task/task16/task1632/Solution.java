package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static
    {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }

    public static void main(String[] args) {
    }

    public static class Thread1 extends Thread {
        @Override
        public void run() {
            while (true) {}
        }
    }

    // Нить 2 из списка threads должна выводить "InterruptedException" при возникновении исключения InterruptedException.

    public static class Thread2 extends Thread {

        @Override
        public void run() {
            try {
                while (true) {
                   Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class Thread3 extends Thread {
        @Override
        public void run() {
            while(true) {
                try {
                    System.out.println("Ура");
                    sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class Thread4 extends Thread implements Message {

        @Override
        public void showWarning() {
            interrupt();
        }
    }

    public static class Thread5 extends Thread {


        @Override
        public void run() {
            String s = "";
            int summ = 0;
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                while (!(s = reader.readLine()).equals("N")) {
                    summ += Integer.parseInt(s);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(summ);
        }
    }

    }