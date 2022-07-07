package com.javarush.task.task03.task0309;

/* 
Сумма 5 чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int a = 1;
        int i = 0;

        while (i<5) {
            a = a+i;
            System.out.println(a);
            i++;
            a++;
        }
    }
}
