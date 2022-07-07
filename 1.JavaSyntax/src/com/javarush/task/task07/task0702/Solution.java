package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] myArray = new String[10];
        myArray[8] = null;
        myArray[9] = null;

        for(int i=0; i<8; i++){
            myArray[i] = reader.readLine();
        }

        for(int i=9; i>-1; i--){
            System.out.println(myArray[i]);
        }

    }
}