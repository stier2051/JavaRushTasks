package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
        displayClosestToTen(15, 5);
    }

    public static void displayClosestToTen(int a, int b) {
        // напишите тут ваш код
        int c = abs(10 - a);
        int d = abs(10 - b);
        if (c < d) {
            System.out.println(a);
        } else {
            if (d < c) {
                System.out.println(b);
            } else {
                System.out.println(a | b);
            }
        }
    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}