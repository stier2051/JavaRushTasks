package com.javarush.task.task18.task1801;

/* 
Максимальный байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        int data = 0;
        int maxByte = 0;


        FileInputStream inputStream = new FileInputStream(file);

        while (inputStream.available() > 0) {
            data = inputStream.read();
            maxByte = Math.max(data, maxByte);
        }
        inputStream.close();
        System.out.println(maxByte);
    }
}
