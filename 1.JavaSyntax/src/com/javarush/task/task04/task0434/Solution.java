package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int i = 1;
        while (i < 11) {
            int j = 1;
            while (j < 11) {
                System.out.print(j*i+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
