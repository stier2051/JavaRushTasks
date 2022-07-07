package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int i = 0;
        int maximum = 0;

        int b = Integer.parseInt(reader.readLine());
        if (N == 1) maximum = b;
        else {
            while (i < N-1) {
                BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
                int a = Integer.parseInt(reader1.readLine());
                if (a>b) {
                    maximum = a;
                    b = a;
                }
                else maximum = b;
                i++;
            }
        }


        //напишите тут ваш код

        System.out.println(maximum);
    }
}
