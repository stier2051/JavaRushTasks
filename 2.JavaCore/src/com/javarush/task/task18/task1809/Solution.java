package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream = new FileOutputStream(file2);
        byte[] buffer = new byte[inputStream.available()];

        if(inputStream.available() > 0) {
            inputStream.read(buffer);
        }

        for (int i = 0; i < buffer.length/2; i++) {
            byte x = buffer[buffer.length - 1 - i];
            buffer[buffer.length - 1 - i] = buffer[i];
            buffer[i] = x;
        }
        outputStream.write(buffer);

        outputStream.close();
        inputStream.close();
    }
}
