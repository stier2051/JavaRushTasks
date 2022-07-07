package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<5; i++) {
            strings.add(reader.readLine());
        }

        int min = strings.get(0).length();
        for (int i=1; i<5; i++) {
            if (strings.get(i).length() < min) min = strings.get(i).length();
        }

        ArrayList<Integer> mini = new ArrayList<Integer>();
        for (int i=0; i<5; i++) {
            if (strings.get(i).length() == min) mini.add(i);
        }

        for (int i=0; i<mini.size(); i++) {
            System.out.println(strings.get(mini.get(i)));
        }
    }
}
