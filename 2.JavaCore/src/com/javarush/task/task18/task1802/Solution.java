package com.javarush.task.task18.task1802;

/* 
Минимальный байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        int data;
        int minByte = 2345 ;

        FileInputStream inputStream = new FileInputStream(file);
        while (inputStream.available() > 0) {
            data = inputStream.read();
            minByte = Math.min(data, minByte);
        }
        inputStream.close();
        System.out.println(minByte);
    }
}
