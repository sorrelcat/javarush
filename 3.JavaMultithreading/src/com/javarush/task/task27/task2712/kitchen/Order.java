package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.Tablet;

import java.io.IOException;
import java.util.List;
import java.util.Observer;

/**
 * Created by sorre on 16.09.2017.
 */
public class Order {

    private final Tablet tablet;
    protected List<Dish> dishes;

    public Order(Tablet tablet) throws IOException {

        this.tablet = tablet;
        this.dishes = ConsoleHelper.getAllDishesForOrder();
    }

    @Override
    public String toString() {

        if(isEmpty()) return "";
        else
        {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < dishes.size(); i++) {
                sb.append(dishes.get(i).toString());
                if(i != dishes.size() - 1) sb.append(", ");
            }
            return "Your order: [" + sb.toString() + "] of " + tablet.toString() + ", cooking time " + getTotalCookingTime() + "min";
        }
    }

    public int getTotalCookingTime() {
        if(isEmpty()) return 0;
        else
        {
            int totalTime = 0;
            for (int i = 0; i < dishes.size(); i++) {
                totalTime += dishes.get(i).getDuration();
            }
            return totalTime;
        }

    }

    public boolean isEmpty() {
        return dishes.size() == 0;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

}
