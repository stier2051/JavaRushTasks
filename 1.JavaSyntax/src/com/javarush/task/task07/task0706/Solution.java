package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int[] myArray = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<15; i++) {
            myArray[i] = Integer.parseInt(reader.readLine());
        }

        int a = myArray[0];
        int b = myArray[1];
        for (int i=2; i<15; i=i+2) {
            a = a + myArray[i];
        }
        for (int i=3; i<15; i=i+2) {
            b = b + myArray[i];
        }

        String answer = a > b ? "В домах с четными номерами проживает больше жителей." : "В домах с нечетными номерами проживает больше жителей.";
        System.out.println(answer);

    }
}
