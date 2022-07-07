package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    String name, address, color;
    int age, weight;

    public Cat(String name) {
        this.name = name;
        this.color ="Black";
        this.age = 12;
        this.weight = 400;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "Blue";
    }
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 500;
        this.color = "Yellow";
    }
    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 4;
    }
    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 5;
    }

    public static void main(String[] args) {

    }
}
