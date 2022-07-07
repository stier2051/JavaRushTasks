package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String t = reader.readLine();
        double dt = Double.parseDouble(t);

        while (dt >= 5) {
            dt = dt - 5;
        }
        if ((dt>=0)&&(dt<=2.9)) {
            System.out.println("зелёный");
        }   else if ((dt>=3)&&(dt<=3.9)) {
            System.out.println("жёлтый");
        }   else if ((dt>=4)&&(dt<=4.9)) {
            System.out.println("красный");
        }
    }
}