package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    String name = null;
    String address = null;
    String color;
    int weight;
    int age;

    public void initialize(String name) {
        this.name = name;
        this.color = "black";
        this.weight = 50;
        this.age = 15;
    }
    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "black";
    }
    public void initialize(String name, int weight) {
        this.name = name;
        this.weight = weight;
        this.color = "white";
    }
    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 13;
    }
    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 15;
    }
    public static void main(String[] args) {

    }
}
