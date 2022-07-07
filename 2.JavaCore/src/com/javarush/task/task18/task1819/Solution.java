package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        int count = 0;
        int count1 = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(file1);
        byte[] buffer = new byte[inputStream.available()];
        while (inputStream.available() > 0) {
            count = inputStream.read(buffer);
        }

        FileOutputStream outputStream = new FileOutputStream(file1);
        FileInputStream inputStream1 = new FileInputStream(file2);

        byte[] buffer1 = new byte[inputStream1.available()];

        while (inputStream1.available() > 0) {
            count1 = inputStream1.read(buffer1);
            outputStream.write(buffer1, 0, count1);

        }
        int a = inputStream1.available();
        outputStream.write(buffer, a, count);
        inputStream.close();
        inputStream1.close();
        outputStream.close();
    }
}
