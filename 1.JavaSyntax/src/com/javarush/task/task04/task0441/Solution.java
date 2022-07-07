package com.javarush.task.task04.task0441;

/* 
Как-то средненько
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

        if ((a>b & b>c) | (a<b & b<c) | a==b | b==c) {
            System.out.println(b);
        } else if ((b>a & a>c) | (b<a & a<c) | (a==b & a==c)) {
            System.out.println(a);
        } else System.out.println(c);
    }
}
