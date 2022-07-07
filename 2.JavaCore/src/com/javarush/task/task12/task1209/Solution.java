package com.javarush.task.task12.task1209;

/* 
Три метода и минимум
*/

public class Solution {
    public static void main(String[] args) {

    }

    //Напишите тут ваши методы
    public static int min(int a, int b) {
        int min = a < b ? a : b;
        return min;
    }
    public static long min(long l1, long l2) {
        long min = l1 < l2 ? l1 : l2;
        return min;
    }
    public static double min(double d1, double d2) {
        double min = d1 < d2 ? d1 : d2;
        return min;
    }
}
