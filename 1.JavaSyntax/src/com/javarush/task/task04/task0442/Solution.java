package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int b = 0;
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String number = reader.readLine();
            int a = Integer.parseInt(number);
            b = b + a;
            if (a == -1) break;
        }
        System.out.println(b);
    }
}
