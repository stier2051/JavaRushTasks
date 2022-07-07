package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    int top;
    int left;
    int width;
    int height;

    public void initialize (int top) {
        this.top = top;
        this.left = 6;
    }

    public void initialize (int top, int left) {
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }
    public void initialize (int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.height = width;
    }
    public void initialize (int left, int top, int width, int height) {
        this.top = top;
        this.left = left;
        this.height = height;
        this.width = width;
    }

    public static void main(String[] args) {

    }
}
