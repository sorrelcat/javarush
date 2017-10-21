package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Man man1 = new Man("Oleg", 20, "Odessa");
        Man man2 = new Man("Igor", 22, "Kiev");
        Woman woman1 = new Woman("Olga", 23, "Kiev");
        Woman woman2 = new Woman("Anna", 24, "Lviv");
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);

    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
    //напишите тут ваш код

//
//    1. В классе Solution создай public static класс Man.
//            2. В классе Solution создай public static класс Woman.
//            3. Класс Man должен содержать переменные: name(String), age(int) и address(String).
//            4. Класс Woman должен содержать переменные: name(String), age(int) и address(String).
//            5. У классов Man и Woman должны быть конструкторы, принимающие параметры с типами String, int и String.
//6. Конструкторы должны инициализировать переменные класса.
//7. В методе main необходимо создать по два объекта каждого типа.
//            8. Метод main должен выводить созданные объекты на экран в указанном формате.
}
