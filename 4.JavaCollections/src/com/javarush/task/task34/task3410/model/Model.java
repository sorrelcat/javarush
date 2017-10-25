package com.javarush.task.task34.task3410.model;

import com.javarush.task.task34.task3410.controller.EventListener;

/**
 * Created by sorre on 24.10.2017.
 */
public class Model {

    public static final int FIELD_CELL_SIZE = 20;
    private EventListener eventListener;

    public void setEventListener(EventListener eventListener) {
        this.eventListener = eventListener;
    }
}
