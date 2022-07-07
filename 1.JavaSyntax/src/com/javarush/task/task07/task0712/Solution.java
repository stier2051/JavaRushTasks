package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<10; i++) {
            list.add(reader.readLine());
        }

        int max = 0;
        int min = list.get(0).length();

        for (int i=0; i<10; i++) {
            if (list.get(i).length() > max) {
                max = list.get(i).length();
            }
        }

        for (int i=1; i<10; i++) {
            if (list.get(i).length() < min) {
                min = list.get(i).length();
            }
        }

        int i = 0;
        int j = 0;
        while (true) {
            if (list.get(i).length() == max) {
                max = i;
                break;
            }
            i++;
        }

        while (true) {
            if (list.get(j).length() == min) {
                min = j;
                break;
            }
            j++;
        }

        int first = max<min ? max : min;

        System.out.println(list.get(first));
    }
}
