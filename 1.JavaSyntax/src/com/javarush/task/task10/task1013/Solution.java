package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private int id;
        private String name;
        private String surname;
        private int yearOfBirth;
        private double height;
        private boolean sex;

        public Human (String name) {
            this.name = name;
        }

        public Human (int id, String name) {
            this.id = id;
            this.name = name;
        }

        public Human (int id, String surname, int yearOfBirth) {
            this.id = id;
            this.surname = surname;
            this.yearOfBirth = yearOfBirth;
        }

        public Human (String surname, int yearOfBirth) {
            this.surname = surname;
            this.yearOfBirth = yearOfBirth;
        }

        public Human (String name, String surname, boolean sex) {
            this.name = name;
            this.surname = surname;
            this.sex = sex;
        }

        public Human (int id, String name, String surname, double height, boolean sex) {
            this.id = id;
            this.name = name;
            this.surname = surname;
            this.height = height;
            this.sex = sex;
        }

        public Human (int id, String name, int yearOfBirth, double height) {
            this.id = id;
            this.name = name;
            this.yearOfBirth = yearOfBirth;
            this.height = height;
        }

        public Human (int id, String name, double height) {
            this.id = id;
            this.name = name;
            this.height = height;
        }

        public Human (int id, String name, String surname, int yearOfBirth, double height, boolean sex) {
            this.id = id;
            this.name = name;
            this.surname = surname;
            this.yearOfBirth = yearOfBirth;
            this.height = height;
            this.sex = sex;
        }

        public Human (int id, String surname, boolean sex) {
            this.id = id;
            this.surname = surname;
            this.sex = sex;
        }
    }
}
