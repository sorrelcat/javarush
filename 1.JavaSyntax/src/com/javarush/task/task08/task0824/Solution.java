package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human child1 = new Human( "child1",true,12 ,new ArrayList(  ));
        Human child2 = new Human( "child2",true,12 ,new ArrayList(  ));
        Human child3 = new Human( "child3",false,12 ,new ArrayList(  ));

        ArrayList child = new ArrayList(  );
        child.add( child1 );
        child.add( child2 );
        child.add( child3 );
        Human father = new Human( "father", true,33 ,child  );
        Human mother = new Human( "mother", false,33 ,child  );

        ArrayList parentsF = new ArrayList(  );
        ArrayList parentsM = new ArrayList(  );
        parentsF.add( father );
        parentsM.add( mother );
        Human ded1 = new Human( "ded1", true,66 ,parentsF  );
        Human ded2 = new Human( "ded2", true,66 ,parentsM  );
        Human bab1 = new Human( "bab1", false,66 ,parentsF  );
        Human bab2 = new Human( "bab2", false,66 ,parentsM  );

        System.out.println(ded1.toString());
        System.out.println(ded2.toString());
        System.out.println(bab1.toString());
        System.out.println(bab2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());

    }

    public static class Human {
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }

    }
}
