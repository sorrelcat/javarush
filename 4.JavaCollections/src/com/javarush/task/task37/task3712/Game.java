package com.javarush.task.task37.task3712;

/**
 * Created by sorre on 09.10.2017.
 */

public abstract class Game {
    public abstract void prepareForTheGame();

    public abstract void playGame();

    public abstract void congratulateWinner();

    public void run() {
        prepareForTheGame();
        playGame();
        congratulateWinner();
    }
}
