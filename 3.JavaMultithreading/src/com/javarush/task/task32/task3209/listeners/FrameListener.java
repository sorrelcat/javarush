package com.javarush.task.task32.task3209.listeners;

import com.javarush.task.task32.task3209.View;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by sorre on 12.09.2017.
 */
public class FrameListener extends WindowAdapter {

    private View view;

    public FrameListener(View view) {
        this.view = view;
    }

    @Override
    public void windowClosing(WindowEvent e) {
        this.view.exit();
    }
}
