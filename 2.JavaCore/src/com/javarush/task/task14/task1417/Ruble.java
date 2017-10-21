package com.javarush.task.task14.task1417;

/**
 * Created by sorre on 01.07.2017.
 */
public class Ruble extends Money {
    public String getCurrencyName() {return "RUB";}

    public Ruble(double a)
    {
        super(a);
    }
}
