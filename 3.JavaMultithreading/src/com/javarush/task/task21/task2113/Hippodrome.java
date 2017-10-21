package com.javarush.task.task21.task2113;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by sorre on 03.08.2017.
 */
public class Hippodrome {

    private List<Horse> horses;

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List horses) {
        this.horses = horses;
    }

    static Hippodrome game;

    public static void main(String[] args) {

        Horse one = new Horse("One", 3, 0);
        Horse two = new Horse("Two", 3, 0);
        Horse three = new Horse("Three", 3, 0);

        game = new Hippodrome(new LinkedList<>());
        game.getHorses().add(one);
        game.getHorses().add(two);
        game.getHorses().add(three);

        game.run();

        game.printWinner();

    }

    public void run() {
        for (int i = 0; i < 100; i++) {

            move();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            print();

        }
    }

    public void move() {

        for (Horse temp : this.getHorses()
             ) {
            temp.move();
        }
    }

    public void print() {
        for (Horse temp : this.getHorses()
                ) {
            temp.print();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner() {
        double max = 0.0;
        Horse temp = new Horse("", 0, 0);
        for (Horse t : this.horses
             ) {
            if(t.getDistance() > max) {
                max = t.getDistance();
                temp = t;
            }
        }

        return temp;
    }


    public void printWinner() {
        System.out.println("Winner is " + this.getWinner().getName() + "!");
    }

}
