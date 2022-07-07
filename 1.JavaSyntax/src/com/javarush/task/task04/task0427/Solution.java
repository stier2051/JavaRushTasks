package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.nio.BufferOverflowException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        int a = Integer.parseInt(number);
        if (a%2 == 0 & a > 0 & a < 10){
            System.out.println("четное однозначное число");
        } else if (a%2 != 0 & a >= 0 & a <10) {
            System.out.println("нечетное однозначное число");
        } else if (a%2 == 0 & a >= 10 & a < 100) {
            System.out.println("четное двузначное число");
        } else if (a%2 != 0 & a >= 10 & a < 100) {
            System.out.println("нечетное двузначное число");
        } else if (a%2 == 0 & a >= 100 & a < 1000) {
            System.out.println("четное трехзначное число");
        } else if (a%2 != 0 & a >=100 & a < 1000) {
            System.out.println("нечетное трехзначное число");
        }
    }
}
