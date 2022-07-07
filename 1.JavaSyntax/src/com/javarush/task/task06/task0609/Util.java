package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //напишите тут ваш код
        double a1 = x2 - x1;
        double a2 = y2 - y1;
        double b = 2;
        double distance = Math.sqrt(Math.pow(a1, b) + Math.pow(a2, b));
        return distance;
    }

    public static void main(String[] args) {
    }
}
