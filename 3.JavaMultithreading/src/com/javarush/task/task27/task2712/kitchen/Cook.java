package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.Tablet;
import com.javarush.task.task27.task2712.ad.AdvertisementManager;
import com.javarush.task.task27.task2712.statistic.StatisticManager;
import com.javarush.task.task27.task2712.statistic.event.CookedOrderEventDataRow;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by sorre on 17.09.2017.
 */
public class Cook extends Observable implements Observer {

    private String name;

    public Cook(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void update(Observable o, Object arg) {

        Tablet tablet = (Tablet) o;
        Order order = (Order) arg;

        StatisticManager.getInstance().register(
                new CookedOrderEventDataRow(
                        tablet.toString(),
                        this.name,
                        order.getTotalCookingTime() * 60,
                        order.getDishes()));

        ConsoleHelper.writeMessage("Start cooking - " + arg.toString());
        setChanged();
        notifyObservers(arg);
    }
}
