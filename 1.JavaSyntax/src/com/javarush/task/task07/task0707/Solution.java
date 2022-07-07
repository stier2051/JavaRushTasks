package com.javarush.task.task07.task0707;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        list.add("sdsd");
        list.add("ewewee");
        list.add("qwqwwe");
        list.add("vbvb");
        list.add("bvbv");

        System.out.println(list.size());
        for (int i=0; i<5; i++) {
            System.out.println(list.get(i));
        }
    }
}
