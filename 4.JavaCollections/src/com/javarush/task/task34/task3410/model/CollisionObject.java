package com.javarush.task.task34.task3410.model;

/**
 * Created by sorre on 24.10.2017.
 */
public abstract class CollisionObject extends GameObject {

    public CollisionObject(int x, int y) {
        super(x, y);
    }

    public boolean isCollision(GameObject gameObject, Direction direction) {

        switch (direction) {
            case LEFT: {
                return (getX() - Model.FIELD_CELL_SIZE == gameObject.getX() && gameObject.getY() == this.getY()) ? true : false;
            }
            case RIGHT: {
                return (getX() + Model.FIELD_CELL_SIZE == gameObject.getX() && gameObject.getY() == this.getY()) ? true : false;
            }
            case DOWN: {
                return (gameObject.getX() == this.getX() && getY() + Model.FIELD_CELL_SIZE == gameObject.getY()) ? true : false;
            }
            case UP: {
                return (gameObject.getX() == this.getX() && getY() - Model.FIELD_CELL_SIZE == gameObject.getY()) ? true : false;
            }
            default:
                return false;
        }
    }
}

/*
4.3.2. Класс CollisionObject должен быть унаследован от GameObject.
4.3.3. Добавь в класс CollisionObject:
4.3.3.1. Конструктор, принимающий int x и int y.
4.3.3.2. Метод boolean isCollision(GameObject gameObject, Direction direction).
Этот метод должен возвращаться true, если при перемещении текущего объекта в направлении direction на FIELD_CELL_SIZE произойдет столкновение с объектом gameObject, переданным в качестве параметра.
Иначе – возвращать false. Столкновением считать совпадение координат x и y.
 */