package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int count = 0;

        String fileName = args[0];
        FileInputStream inputStream = new FileInputStream(fileName);

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            //System.out.println(data);
            if (data >64 && data < 123) {
                count++;
            }
        }
        inputStream.close();
        System.out.println(count);
    }
}
