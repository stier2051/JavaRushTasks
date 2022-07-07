package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int i = 0;
        int j = 0;
        int a;
        int b = 1;
        int c = 1;
        while(i<10) {
            while(j<10) {
                a = c*b;
                System.out.print(a+" ");
                c++;
                j++;
            }
            System.out.println();
            j = 0;
            c = 1;
            b++;
            i++;
        }
    }
}
