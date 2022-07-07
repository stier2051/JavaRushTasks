package com.javarush.task.task10.task1015;

import java.io.IOException;
import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] list = new ArrayList[2];
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("привет");
        list1.add("пока");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("hello");
        list[0] = list1;
        list[1] = list2;
        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}