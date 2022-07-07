package com.javarush.task.task08.task0812;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        int povtor = 1;
        int max = 1;

        for (int i=0; i<list.size()-1; i++) {
            if (list.get(i).equals(list.get(i+1))) povtor++;
            else {
                list1.add(povtor);
                povtor = 1;
            }
        }
        list1.add(povtor);

        for (int i=0; i<list1.size(); i++) {
            if (list1.get(i) > max) max = list1.get(i);
        }

        System.out.println(max);
    }
}