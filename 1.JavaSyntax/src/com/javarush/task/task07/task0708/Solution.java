package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<5; i++) {
            String s = reader.readLine();
            strings.add(s);
        }

        int max = 0;
        String longestS = "";
        for (int i=0; i<5; i++) {
            if (strings.get(i).length() > max) {
                max = strings.get(i).length();
            }
        }

        ArrayList<Integer> maxi = new ArrayList<Integer>();
        for (int i=0; i<5; i++) {
            if (strings.get(i).length() == max) {
                maxi.add(i);
            }
        }

        for (int i=0; i<maxi.size(); i++) {
            System.out.println(strings.get(maxi.get(i)));
        }
    }
}
