package com.javarush.task.task27.task2712.kitchen;

/**
 * Created by sorre on 16.09.2017.
 */
public enum Dish {

    Fish(25), Steak(30), Soup(15), Juice(5), Water(3);
    private int duration;

    public int getDuration() {
        return duration;
    }

    Dish(int i) {
        duration = i;
    }


    public static String allDishesToString() {
        Dish [] dish = Dish.values();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dish.length; i++) {
            sb.append(dish[i]);
            if(i != dish.length - 1) sb.append(", ");
        }
        return sb.toString();
    }
}
