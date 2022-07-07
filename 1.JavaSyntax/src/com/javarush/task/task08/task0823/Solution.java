package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine().trim();

        //напишите тут ваш код
        String[] words = string.split("\\s+");
        ArrayList<String> list = new ArrayList<>();
        for (int i=0; i<words.length; i++) {
            list.add(words[i].substring(0,1).toUpperCase() + words[i].substring(1));
        }

        String wordsUpperCase = "";
        String wordsUpperCase1 = "";

        for (int i=0; i<list.size(); i++) {
           wordsUpperCase = (list.get(i) + " ");
           wordsUpperCase1 = wordsUpperCase1 + wordsUpperCase;

        }

        System.out.println(wordsUpperCase1);
    }
}
