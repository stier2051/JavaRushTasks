package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sSide1 = reader.readLine();
        String sSide2 = reader.readLine();
        String sSide3 = reader.readLine();

        int nSide1 = Integer.parseInt(sSide1);
        int nSide2 = Integer.parseInt(sSide2);
        int nSide3 = Integer.parseInt(sSide3);

        if (((nSide1+nSide2>nSide3)) & ((nSide1+nSide3>nSide2)) & ((nSide2+nSide3>nSide1))) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");
        }
    }
}