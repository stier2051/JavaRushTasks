package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] myArray = new int[20];
        int[] subArrayOne = new int[10];
        int[] subArrayTwo = new int[10];

        for (int i=0; i<20; i++) {
            myArray[i] = Integer.parseInt(reader.readLine());
        }

        for (int i=0; i<10; i++) {
            subArrayOne[i] = myArray[i];
            subArrayTwo[i] = myArray[i+10];
        }

        for (int i=0; i<10; i++) {
            System.out.println(subArrayTwo[i]);
        }

    }
}
