package com.javarush.task.task04.task0424;

/* 
Три числа
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

        if (a != b & a != c & b == c) {
            System.out.println(1);
        } else if (b != a & b != c & a == c) {
            System.out.println(2);
        } else if (c != a & c != b & a == b) {
            System.out.println(3);
        }
    }
}
