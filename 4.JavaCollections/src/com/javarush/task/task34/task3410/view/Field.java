package com.javarush.task.task34.task3410.view;

import com.javarush.task.task34.task3410.controller.EventListener;
import com.javarush.task.task34.task3410.model.Box;
import com.javarush.task.task34.task3410.model.GameObject;
import com.javarush.task.task34.task3410.model.Player;

import javax.swing.*;
import java.awt.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by sorre on 24.10.2017.
 */
public class Field extends JPanel {

    private View view;
    private EventListener eventListener;

    public Field(View view) {
        this.view = view;
    }

    public void paint(Graphics g) {

        g.setColor(Color.black);
        g.fillRect(0, 0, view.getWidth(), view.getHeight());
        Set<GameObject> gameObjectSet = view.getGameObjects().getAll();
        for (GameObject t: gameObjectSet
             ) {
            t.draw(g);
        }

    }

    public void setEventListener(EventListener eventListener) {
        this.eventListener = eventListener;
    }
}

