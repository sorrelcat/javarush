package com.javarush.task.task26.task2613;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by sorre on 16.10.2017.
 */
public class ConsoleHelper {

    private static BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() {

        try {
            return bis.readLine();
        }
        catch (Exception e) {}

        return null;
    }
}


