package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Human grandpa1 = new Human("John", true, 60);
        Human grandpa2 = new Human("Max", true, 62);
        Human grandma1 = new Human("Jane", false, 55);
        Human grandma2 = new Human("Merry", false, 58);
        Human hfather = new Human("Mike", true, 30, grandpa1, grandma1);
        Human hmother = new Human("Molly", false, 31, grandpa2, grandma2);
        Human child1 = new Human("Bobby", true, 5, hfather, hmother);
        Human child2 = new Human("Pennie", false, 6, hfather, hmother);
        Human child3 = new Human("Izzy", false, 8, hfather, hmother);

        System.out.println(grandpa1.toString());
        System.out.println(grandma1.toString());
        System.out.println(grandpa2.toString());
        System.out.println(grandma2.toString());
        System.out.println(hfather.toString());
        System.out.println(hmother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age)        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = null;
            this.mother = null;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother)        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }

    }
}






















