package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        int[] myArray = new int[5];

        for(int i=0; i<5; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            myArray[i] = Integer.parseInt(reader.readLine());
        }
        for(int i=0; i<5;i++) {
            Arrays.sort(myArray, 0, 5);
            System.out.println(myArray[i]);
        }
        //напишите тут ваш код


    }
}
