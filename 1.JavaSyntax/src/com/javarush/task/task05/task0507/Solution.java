package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        double a = 0;
        int i = 0;
        while(true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String number = reader.readLine();
            int sNumber = Integer.parseInt(number);
            a = a + sNumber;
            i++;
            if (sNumber == -1) {
                a = (a+1)/(i-1);
                break;
            }

        }
        System.out.println(a);
    }
}

