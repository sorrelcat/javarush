package com.javarush.task.task29.task2909.car;

/**
 * Created by sorre on 26.08.2017.
 */
public class Sedan extends Car {

    private final int MAX_SEDAN_SPEED = 120;

    public Sedan(int numberOfPassengers) {
        super(SEDAN, numberOfPassengers);
    }

    @Override
    public int getMaxSpeed() {
        return MAX_SEDAN_SPEED;
    }
}
