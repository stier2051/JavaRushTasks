package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // напишите тут ваш код
        for (int i=array.length-1; i>0; i--) {
            for (int j=array.length-1; j>0; j--) {
                if (isNumber(array[j])) {
                    for (int z=j-1; z>=0; z--) {
                        if (isNumber(array[z])) {
                            if (Integer.parseInt(array[j]) > Integer.parseInt(array[z])) {
                                String tmp = array[z];
                                array[z] = array[j];
                                array[j] = tmp;
                            }
                        }
                    }
                }
            }
        }

        for (int i=array.length-1; i>0; i--) {
            for (int j=0; j<i; j++) {
                if (isNumber(array[j]) == false) {
                    for (int z=j+1; z<=i; z++) {
                        if (isNumber(array[z]) == false) {
                            if (isGreaterThan(array[j], array[z])) {
                                String tmp = array[j];
                                array[j] = array[z];
                                array[z] = tmp;
                            }
                        }
                    }
                }
            }
        }



    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
