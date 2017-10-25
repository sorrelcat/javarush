package com.javarush.task.task34.task3410.model;

import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by sorre on 25.10.2017.
 */
public class LevelLoader {

    private Path levels;

    public LevelLoader(Path levels) {
        this.levels = levels;
    }

    public GameObjects getLevel(int level) {

        Set<Wall> wallSet = new HashSet<>();
        wallSet.add(new Wall(10, 10));
        wallSet.add(new Wall(50, 50));
        wallSet.add(new Wall(50, 10));
        Set<Box> boxSet = new HashSet<>();
        boxSet.add(new Box(30, 70));
        Set<Home> homeSet = new HashSet<>();
        homeSet.add(new Home(90, 70));
        return new GameObjects(wallSet, boxSet, homeSet, new Player(30, 30));
    }
}

