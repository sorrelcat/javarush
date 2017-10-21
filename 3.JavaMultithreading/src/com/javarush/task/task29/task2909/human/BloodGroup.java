package com.javarush.task.task29.task2909.human;

/**
 * Created by sorre on 26.08.2017.
 */
public class BloodGroup {
    private final int code;

    private BloodGroup(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static BloodGroup first() {
        return new BloodGroup(1);
    }

    public static BloodGroup second() {
        return new BloodGroup(2);
    }

    public static BloodGroup third() {
        return new BloodGroup(3);
    }

    public static BloodGroup fourth() {
        return new BloodGroup(4);
    }

}

/*
5. Необходимо добавить в класс BloodGroup константное поле int code,
приватный конструктор, принимающий int и инициализирующий поле code, геттер для поля класса.
        6. Необходимо добавить в класс BloodGroup статические методы first(), second(), third() и fourth(),
        создающие и возвращающие объекты типа BloodGroup с правильным кодом внутри (1, 2, 3 и 4 соответственно).
        7. Необходимо изменить тип поля bloodGroup класса Human на BloodGroup, обновить сеттер и геттер.
        8. Необходимо удалить из класса Human константы: FIRST, SECOND, THIRD, FOURTH.*/
