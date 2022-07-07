package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

        //напишите тут ваш код
        char[] strArray = s.toCharArray();
        for (int i=0; i<40; i++) {
            for (int j=0; j<strArray.length-i; j++) {
                System.out.print(strArray[j+i]);
            }
            System.out.println();
        }

    }

}

