package com.javarush.task.task34.task3410.controller;

import com.javarush.task.task34.task3410.model.Model;
import com.javarush.task.task34.task3410.view.View;

/**
 * Created by sorre on 24.10.2017.
 */
public class Controller {

    private View view;
    private Model model;

    public Controller() {

        this.view = new View(this);
        this.model = new Model();

    }

    public static void main(String [] args) {
        
    }
}
