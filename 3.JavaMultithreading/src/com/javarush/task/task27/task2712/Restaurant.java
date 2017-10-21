package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.kitchen.Waiter;

/**
 * Created by sorre on 16.09.2017.
 */
public class Restaurant {

    public static void main(String[] args) {
        Tablet five = new Tablet(5);
        Cook cook = new Cook("Amigo");
        five.addObserver(cook);
        Waiter waiter = new Waiter();
        cook.addObserver(waiter);
        five.createOrder();

    }

}
