package com.javarush.task.task04.task0428;

/* 
Положительное число
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

        int q1, q2, q3;

        if (a>0) q1 = 1;
        else q1 = 0;

        if (b>0) q2 = 1;
        else q2 = 0;

        if (c>0) q3 = 1;
        else q3 = 0;

        System.out.println(q1+q2+q3);
    }
}
