package com.javarush.task.task01.task0136;

/*
Да хоть на Луну!
*/

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите свой вес");
        String weight = reader.readLine();
        int earthWeight = Integer.parseInt(weight);
        System.out.println("Ваш вес на луне");
        System.out.println(getWeight(earthWeight));

    }

    public static double getWeight(int earthWeight) {
        //напишите тут ваш код
        double moonWeight = earthWeight*0.17;
        return moonWeight;
    }
}