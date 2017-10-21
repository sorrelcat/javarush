package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private String surname;
        private int age;
        private boolean gender;
        private int height;
        private double weight;

        public Human()
        {
            this.name = "John";
            this.surname = "Doe";
            this.gender = true;
            this.age = 1;
            this.height = 150;
            this.weight = 50;

        }
        public Human(int age)
        {
            this();
            this.age = age;
        }
        public Human(int height, double weight)
        {
            this();
            this.height = height;
            this.weight = weight;
        }
        public Human(double weight)
        {
            this.weight = weight;
        }
        public Human(String name)
        {
            this.name = name;
            this.surname = "Smith";
        }
        public Human(String name, String surname)
        {
            this.name = name;
            this.surname = surname;
        }
        public Human(boolean gender)
        {
            this();
            this.gender = gender;
        }
        public Human(String name, String surname, int age, boolean gender, int height, double weight)
        {
            this.gender = gender;
            this.surname = surname;
            this.name = name;
            this.weight = weight;
            this.height = height;
            this.age = age;
        }
        public Human(Human h)
        {
            this.age = h.age;
            this.gender = h.gender;
            this.height = h.height;
            this.weight = h.weight;
            this.name = h.name;
            this.surname = h.surname;
        }
        public Human(double weight, int height, int age)
        {
            this.name = "Post";
            this.surname = "Mortem";
            this.weight = weight;
            this.height = height;
            this.age = age;
        }
    }
}
