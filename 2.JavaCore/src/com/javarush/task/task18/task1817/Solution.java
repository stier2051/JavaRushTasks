package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.text.DecimalFormat;

public class Solution {
    public static void main(String[] args) throws Exception {
        double allCount = 0;
        double spaceCount = 0;

        DecimalFormat df = new DecimalFormat("###.##");
        String fileName = args[0];
        FileInputStream inputStream = new FileInputStream(fileName);

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            allCount++;
            if (data == 32) {
                spaceCount++;
            }
        }
        inputStream.close();
        System.out.println(df.format(spaceCount/allCount*100));
    }
}
