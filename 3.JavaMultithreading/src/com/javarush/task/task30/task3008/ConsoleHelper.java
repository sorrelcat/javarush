package com.javarush.task.task30.task3008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sorre on 28.08.2017.
 */
public class ConsoleHelper {

    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() {

        String temp = "";
        try {
            temp = bufferedReader.readLine();
        } catch (IOException e) {
            System.out.println("Произошла ошибка при попытке ввода текста. Попробуйте еще раз.");
            temp = readString();
        }

        return temp;
    }

    public static int readInt() {
        while (true)
        {
            try {
                return Integer.parseInt(readString());
            } catch (NumberFormatException e) {writeMessage("Произошла ошибка при попытке ввода числа. Попробуйте еще раз.");}
        }
    }
}
