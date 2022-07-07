package com.javarush.task.task04.task0432;

/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        String number = reader.readLine();

        int a = Integer.parseInt(number);
        int i = 0;
        while (i<a) {
            System.out.println(string);
            i++;
        }
    }
}
