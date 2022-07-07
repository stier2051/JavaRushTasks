package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    //статический блок
    static {
        labels.put(34.5, "Hello");
        labels.put(12.45, "Bye");
        labels.put(56.12, "Cat");
        labels.put(67.3, "Dog");
        labels.put(98.3, "Animal");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
