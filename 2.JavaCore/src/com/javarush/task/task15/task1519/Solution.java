package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String s = reader.readLine();
            if (s.equals("exit")) break;

            try {
                int x = Integer.parseInt(s);
                if (x>0 && x<128) print((short)x);
                else {
                    print(x);
                }
            }   catch (NumberFormatException e) {
                if (s.contains(".")) {
                    try {
                        Double d = Double.parseDouble(s);
                        print(d);
                    } catch (NumberFormatException ex) {
                        print(s);
                    }

            } else {
                print(s);
            }
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
