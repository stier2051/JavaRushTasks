package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код
    int left, top, width, height;

    public Rectangle(int left) {
        this.left = left;
        this.top = 7;
    }
    public Rectangle(int left, int top) {
        this.left = left;
        this.top = top;
        this.height = width;
    }
    public Rectangle(int left, int top, int width, int height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }
    public Rectangle(int left, int top, int width) {
        this.left = left;
        this.top = top;
        this.width = width;
    }

    public static void main(String[] args) {

    }
}
