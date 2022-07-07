package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sYear = reader.readLine();
        int nYear = Integer.parseInt(sYear);
        int Year;
        if (nYear % 400 == 0) {
            System.out.println("количество дней в году: 366");
        } else if (((nYear % 400 != 0)&(nYear % 100 == 0))||((nYear % 400 != 0)&(nYear % 100 != 0)&(nYear % 4 != 0))) {
            System.out.println("количество дней в году: 365");
        } else if ((nYear % 4 == 0)&(nYear % 100 != 0)) {
            System.out.println("количество дней в году: 366");
        }
    }
}