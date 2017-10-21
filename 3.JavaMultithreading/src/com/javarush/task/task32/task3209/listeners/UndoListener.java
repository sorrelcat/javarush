package com.javarush.task.task32.task3209.listeners;

import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.UndoManager;

/**
 * Created by sorre on 12.09.2017.
 */
public class UndoListener implements UndoableEditListener {

    private UndoManager undoManager;

    @Override
    public void undoableEditHappened(UndoableEditEvent e) {
        undoManager.addEdit(e.getEdit());
    }

    public UndoListener(UndoManager undoManager) {
        this.undoManager = undoManager;
    }
}
