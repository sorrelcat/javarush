package com.javarush.task.task35.task3513;

import java.util.*;

/**
 * Created by sorre on 20.09.2017.
 */
public class Model {

    private static final int FIELD_WIDTH = 4;
    private Tile[][] gameTiles;
    public int score;
    public int maxTile;

    private Stack<Tile[][]> previousStates = new Stack();
    private Stack<Integer> previousScores = new Stack();
    private boolean isSaveNeeded = true;

    public Model() {
        this.resetGameTiles();
    }

    private List<Tile> getEmptyTiles() {

        List<Tile> emptyTilesList = new ArrayList<>();
        for (int i = 0; i < FIELD_WIDTH; i++) {
            for (int j = 0; j < FIELD_WIDTH; j++) {
                if (gameTiles[i][j].isEmpty()) emptyTilesList.add(gameTiles[i][j]);
            }

        }
        return emptyTilesList;

    }

    public Tile[][] getGameTiles() {
        return gameTiles;
    }


    public boolean canMove() {
        if (!getEmptyTiles().isEmpty()) return true;

        for (int i = 0; i < gameTiles.length; i++) {
            for (int j = 1; j < gameTiles.length; j++) {
                if (gameTiles[i][j].value == gameTiles[i][j - 1].value && gameTiles[j - 1][i].value != 0)
                    return true;
            }
        }
        for (int i = 0; i < gameTiles.length; i++) {
            for (int j = 1; j < gameTiles.length; j++) {
                if (gameTiles[j][i].value == gameTiles[j - 1][i].value && gameTiles[j - 1][i].value != 0)
                    return true;
            }
        }
        return false;
    }


    private void addTile() {

        List<Tile> list = getEmptyTiles();

        if (list != null && list.size() != 0) {
            int number = (int) (list.size() * Math.random());
            Tile randomTile = list.get(number);
            randomTile.value = Math.random() < 0.9 ? 2 : 4;
        }
    }

    public void resetGameTiles() {
        score = 0;
        maxTile = 2;
        gameTiles = new Tile[FIELD_WIDTH][FIELD_WIDTH];
        for (int i = 0; i < FIELD_WIDTH; i++) {
            for (int j = 0; j < FIELD_WIDTH; j++) {
                gameTiles[i][j] = new Tile();
            }
        }
        this.addTile();
        this.addTile();
    }

    private boolean compressTiles(Tile[] tiles) {
        int j = 0;
        boolean flag = false;
        for (int i = 0; i < tiles.length - 1; i++) {
            if (tiles[i].value == 0 && tiles[i + 1].value != 0) {
                flag = true;
                break;
            }
        }
        for (int i = 0; i < tiles.length; i++) {
            if (tiles[i].value != 0) {
                tiles[j].value = tiles[i].value;
                j++;
            }
        }
        for (int i = j; i < tiles.length; i++) {
            tiles[i].value = 0;
        }
        return flag;
    }

    private boolean mergeTiles(Tile[] tiles) {
        boolean flag = false;
        for (int i = 0; i < tiles.length - 1; i++) {
            if (tiles[i].value == tiles[i + 1].value && tiles[i].value != 0) {
                flag = true;
                tiles[i].value *= 2;
                this.score += tiles[i].value;
                tiles[i + 1].value = 0;
                if (this.maxTile < tiles[i].value) this.maxTile = tiles[i].value;
            }
        }
        this.compressTiles(tiles);
        return flag;
    }

    public void left() {
        if (isSaveNeeded) {
            this.saveState(this.getGameTiles());
            isSaveNeeded = true;
        }
        int flag = 0;
        for (int i = 0; i < FIELD_WIDTH; i++) {
            if (this.compressTiles(this.gameTiles[i])) flag++;
            if (this.mergeTiles(this.gameTiles[i])) flag++;
        }
        if (flag > 0) this.addTile();
    }


    public void rotate() {
        Tile[][] tempTiles = new Tile[FIELD_WIDTH][FIELD_WIDTH];

        for (int i = 0; i < FIELD_WIDTH; i++) {
            for (int j = 0; j < FIELD_WIDTH; j++) {
                tempTiles[j][FIELD_WIDTH - 1 - i] = new Tile(this.gameTiles[i][j].value);
            }
        }
        for (int i = 0; i < FIELD_WIDTH; i++) {
            for (int j = 0; j < FIELD_WIDTH; j++) {
                this.gameTiles[i][j].value = tempTiles[i][j].value;
            }
        }
    }

    public void right() {
        this.saveState(this.getGameTiles());
        rotate();
        rotate();
        this.left();
        rotate();
        rotate();
    }

    public void down() {
        this.saveState(this.getGameTiles());
        rotate();
        left();
        rotate();
        rotate();
        rotate();
    }

    public void up() {
        this.saveState(this.getGameTiles());
        rotate();
        rotate();
        rotate();
        left();
        rotate();
    }


    private void saveState(Tile[][] tilesArray) {

        Tile[][] tempArray = new Tile[FIELD_WIDTH][FIELD_WIDTH];
        for (int i = 0; i < FIELD_WIDTH; i++) {
            for (int j = 0; j < FIELD_WIDTH; j++) {
                tempArray[i][j] = new Tile(tilesArray[i][j].value);
            }
        }
        this.previousStates.push(tempArray);
        this.previousScores.push(this.score);
        this.isSaveNeeded = false;

    }

    public void rollback() {
        if (!previousScores.empty() && !previousStates.empty()) {
            this.gameTiles = previousStates.pop();
            this.score = previousScores.pop();
        }

    }

    public void randomMove() {

        int number = ((int) (Math.random() * 100)) % 4;
        switch (number) {
            case 0: {
                this.left();
                break;
            }
            case 1: {
                this.right();
                break;
            }
            case 2: {
                this.up();
                break;
            }
            default: {
                this.down();
                break;
            }
        }
        
    }

    private boolean hasBoardChanged() {
        Tile[][] tempArray = new Tile[FIELD_WIDTH][FIELD_WIDTH];
        for (int i = 0; i < FIELD_WIDTH; i++) {
            for (int j = 0; j < FIELD_WIDTH; j++) {
                tempArray[i][j] = new Tile(this.getGameTiles()[i][j].value);
            }
        }
        for (int i = 0; i < FIELD_WIDTH; i++) {
            for (int j = 0; j < FIELD_WIDTH; j++) {
                if(tempArray[i][j].value != this.previousStates.peek()[i][j].value) {
                    return true;
                }
            }
        }
        return false;
    }

    private MoveEfficiency getMoveEfficiency(Move move) {
        MoveEfficiency moveEfficiency;
        move.move();
        if (hasBoardChanged()) moveEfficiency = new MoveEfficiency(getEmptyTiles().size(), score, move);
        else moveEfficiency = new MoveEfficiency(-1, 0, move);
        rollback();

        return moveEfficiency;
    }

    public void autoMove() {
        PriorityQueue<MoveEfficiency> priorityQueue = new PriorityQueue(4, Collections.reverseOrder());
        priorityQueue.offer(getMoveEfficiency(this::left));
        priorityQueue.offer(getMoveEfficiency(this::right));
        priorityQueue.offer(getMoveEfficiency(this::up));
        priorityQueue.offer(getMoveEfficiency(this::down));
        Move move = priorityQueue.peek().getMove();
        move.move();
    }

}

