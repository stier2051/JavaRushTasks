package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

import org.w3c.dom.ls.LSOutput;

public class Calculator {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        int c = a + b;
        return c;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        int c = a - b;
        return c;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        int c = a * b;
        return c;
    }

    public static double division(int a, int b) {
        //напишите тут ваш код
        double c = (double)a/b;
        return c;
    }

    public static double percent(int a, int b) {
        //напишите тут ваш код
        double c = (double)b/100*a;
        return c;
    }

    public static void main(String[] args) {
        System.out.println(Calculator.plus(3,5));
        System.out.println(Calculator.minus(5,3));
        System.out.println(Calculator.multiply(3,5));
        System.out.println(Calculator.division(6,4));
        System.out.println(Calculator.percent(30,9));
    }
}