package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import org.w3c.dom.ls.LSOutput;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human andrey = new Human("Андрей", true, 67);
        System.out.println(andrey.toString());
        Human sveta = new Human("Светлана", false, 74);
        System.out.println(sveta.toString());
        Human tolik = new Human("Анатолий", true, 68);
        System.out.println(tolik.toString());
        Human zhuldyz = new Human("Жулдыз", false, 77);
        System.out.println(zhuldyz.toString());

        Human serik = new Human("Серик", true, 35, tolik, zhuldyz);
        System.out.println(serik.toString());
        Human asel = new Human("Асель", false, 30, andrey, sveta);
        System.out.println(asel.toString());

        Human michael = new Human("Майкл", true, 13, serik, asel);
        System.out.println(michael.toString());
        Human gaga = new Human("Гага", false, 10, serik, asel);
        System.out.println(gaga.toString());
        Human brithney = new Human("Бритней", false, 8, serik, asel);
        System.out.println(brithney.toString());
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human (String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human (String name, boolean sex, int age, Human father, Human mother) {
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

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}