package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = reader.readLine();
        String number2 = reader.readLine();

        int number11 = Integer.parseInt(number1);
        int number22 = Integer.parseInt(number2);

        if (number11 < number22) {
            System.out.println(number11);
        } else if (number22 < number11) {
            System.out.println(number22);
        } else {
            int number = number11 | number22;
            System.out.println(number);
        }
    }
}