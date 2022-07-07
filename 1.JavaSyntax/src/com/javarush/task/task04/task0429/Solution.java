package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = reader.readLine();
        String number2 = reader.readLine();
        String number3 = reader.readLine();

        int a = Integer.parseInt(number1);
        int b = Integer.parseInt(number2);
        int c = Integer.parseInt(number3);

        int positive1=0, positive2=0, positive3=0;
        int negative1=0, negative2=0, negative3=0;

        if (a>0) {
            positive1 = 1;
            negative1 = 0;
        } else if (a<0) {
            positive1 = 0;
            negative1 = 1;
        }
        if (b>0) {
            positive2 = 1;
            negative2 = 0;
        } else if (b<0) {
            positive2 = 0;
            negative2 = 1;
        }
        if (c>0) {
            positive3 = 1;
            negative3 = 0;
        } else if (c<0) {
            positive3 = 0;
            negative3 = 1;
        }

        int positiveSum = positive1+positive2+positive3;
        int negativeSum = negative1+negative2+negative3;

        System.out.println("количество положительных чисел: "+positiveSum);
        System.out.println("количество отрицательных чисел: "+negativeSum);
    }
}
