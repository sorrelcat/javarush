package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        //напишите тут ваш код

        Dog linda = new Dog("linda", "kurzhaar", 45);
        Cat plushman = new Cat("plushman", 8, "black");
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog {
        String name;
        String poroda;
        int height;

        public Dog(String name, String poroda, int height) {
            this.name = name;
            this.poroda = poroda;
            this.height = height;
        }
    }

    public static class Cat {
        String name;
        int weight;
        String color;

        public Cat(String name, int weight, String color) {
            this.name = name;
            this.weight = weight;
            this.color = color;
        }
    }

    //напишите тут ваш код
}
