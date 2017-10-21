package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sorre on 16.09.2017.
 */
public class ConsoleHelper {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage( String message) {
        System.out.println(message);
    }

    public static String readString() throws IOException {

        return reader.readLine();
    }

    public static List<Dish> getAllDishesForOrder() throws IOException {
        writeMessage(Dish.allDishesToString());
        writeMessage("Select dishes, exit to finish");
        String s = "";
        List<Dish> selectedDishes = new ArrayList<>();
        Dish [] dishes = Dish.values();
        while (!s.equals("exit")) {
            s = readString();
            if(s.equals("exit")) continue;
            boolean flag = false;
            for (Dish t: dishes
                 ) {
                if(s.equals(t.toString())) {
                    selectedDishes.add(t);
                    flag = true;
                    break;
                }
            }
            if (flag == false) writeMessage("No such dish in menu");
        }
        return selectedDishes;
    }


}
