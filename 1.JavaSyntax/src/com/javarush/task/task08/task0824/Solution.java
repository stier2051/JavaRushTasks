package com.javarush.task.task08.task0824;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human childrenOne = new Human("Gena", false, 15);
        Human childrenTwo = new Human("Vasilisa", true, 8);
        Human childrenThree = new Human("Rose", true, 5);
        ArrayList<Human> childrenOfChildren = new ArrayList<>();
        childrenOfChildren.add(childrenOne);
        childrenOfChildren.add(childrenTwo);
        childrenOfChildren.add(childrenThree);

        Human father = new Human("Ashat", false, 32, childrenOfChildren);
        ArrayList<Human> childrenOfGrandFather = new ArrayList<>();
        childrenOfGrandFather.add(father);

        Human mother = new Human("Aisulu", true, 24, childrenOfChildren);
        ArrayList<Human> childrenOfGrandMother = new ArrayList<>();
        childrenOfGrandMother.add(mother);

        Human grandpaFather = new Human("Ata", false, 67, childrenOfGrandFather);
        Human grandmaFather = new Human("Zhibek", true, 65, childrenOfGrandFather);
        Human grandpaMother = new Human("Serik", false, 53, childrenOfGrandMother);
        Human grandmaMother = new Human("Aigul", true, 51, childrenOfGrandMother);

        System.out.println(grandpaFather.toString());
        System.out.println(grandmaFather.toString());
        System.out.println(grandpaMother.toString());
        System.out.println(grandmaMother.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(childrenOne.toString());
        System.out.println(childrenTwo.toString());
        System.out.println(childrenThree.toString());
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human (String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human (String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.addAll(children);
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
