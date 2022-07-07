package com.javarush.task.task12.task1210;

/* 
Три метода и максимум
*/

public class Solution {
    public static void main(String[] args) {

    }

    //Напишите тут ваши методы
    public static int max(int i, int j) {
        int max = i > j ? i : j;
        return max;
    }
    public static long max(long l1, long l2) {
        long max = l1 > l2 ? l1 : l2;
        return max;
    }
    public static double max(double d1, double d2) {
        double max = d1 > d2 ? d1 : d2;
        return max;
    }
}
