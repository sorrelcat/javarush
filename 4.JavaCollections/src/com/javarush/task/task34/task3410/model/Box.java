package com.javarush.task.task34.task3410.model;

import java.awt.*;

/**
 * Created by sorre on 24.10.2017.
 */
public class Box extends CollisionObject implements Movable {

    public Box(int x, int y) {
        super(x, y);
    }

    @Override
    public void move(int x, int y) {
        setX(getX() + x);
        setY(getY() + y);
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color.ORANGE);

        int leftUpperCornerX = getX() - getWidth() / 2;
        int leftUpperCornerY = getY() - getHeight() / 2;

        graphics.drawRect(leftUpperCornerX, leftUpperCornerY, getWidth(), getHeight());
        graphics.drawLine(leftUpperCornerX, leftUpperCornerY, leftUpperCornerX + getWidth(), leftUpperCornerY + getHeight());
        graphics.drawLine(leftUpperCornerX, leftUpperCornerY + getHeight(), leftUpperCornerX + getWidth(), leftUpperCornerY);

    }
}


