package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int[] numbers = new int[20];
        for (int i=0; i<20; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        int maximum = numbers[0];
        int minimum = numbers[0];

        for (int i=1; i<numbers.length; i++) {
            if (numbers[i] > maximum) maximum = numbers[i];
            if (numbers[i] < minimum) minimum = numbers[i];
        }
        System.out.print(maximum + " " + minimum);
    }
}
