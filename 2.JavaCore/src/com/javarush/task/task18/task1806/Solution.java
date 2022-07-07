package com.javarush.task.task18.task1806;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Исправить ошибки
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("E:\\java_project\\files for tasks\\task1630.txt");
        // Создаем поток-записи-байт-в-файл
        FileOutputStream outputStream = new FileOutputStream("E:\\java_project\\files for tasks\\result.txt");
        byte[] buffer = new byte[inputStream.available()];
       if (inputStream.available() > 0) {
            //читаем весь файл одним куском

            int count = inputStream.read(buffer);
            outputStream.write(buffer, 0, count);
           System.out.println(count);
        }

        inputStream.close();
        outputStream.close();
    }
}
