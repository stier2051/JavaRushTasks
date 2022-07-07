package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import org.w3c.dom.ls.LSOutput;

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
        int max;
        int min;
        int mid;

        if (a>=b & a>=c & b>=c) {
            max = a;
            mid = b;
            min = c;
            System.out.println(a+" "+b+" "+c);
        } else if (a>=b & a>=c & b<=c) {
            max = a;
            mid = c;
            min = b;
            System.out.println(a+" "+c+" "+b);
        } else if (b>=a & b>=c & a>=c) {
            max = b;
            mid = a;
            min = c;
            System.out.println(b+" "+a+" "+c);
        } else if (b>=a & b>=c & a<=c) {
            max = b;
            mid = c;
            min = a;
            System.out.println(b+" "+c+" "+a);
        } else if (c>=a & c>=b & a>=b) {
            max = c;
            mid = a;
            min = b;
            System.out.println(c+" "+a+" "+b);
        } else if (c>=a & c>=b & a<=b) {
            max = c;
            mid = b;
            min = a;
            System.out.println(c+" "+b+" "+a);
        }
    }
}
