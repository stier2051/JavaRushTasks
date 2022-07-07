package com.javarush.task.task18.task1808;

/* 
Разделение файла
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
        String file3 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream1 = new FileOutputStream(file2);
        FileOutputStream outputStream2 = new FileOutputStream(file3);

        byte[] buffer = new byte[inputStream.available()];
        int half = buffer.length / 2;
        byte[] bufferFirstHalf = new byte[buffer.length - half];
        byte[] bufferSecondHalf = new byte[half];
        System.out.println(half);
        System.out.println(buffer.length);
        System.out.println(bufferFirstHalf.length);

        if (buffer.length % 2 == 0) {
            if (inputStream.available() > 0) {
                inputStream.read(buffer);
                outputStream1.write(buffer, 0, bufferFirstHalf.length);
                outputStream2.write(buffer, half, bufferSecondHalf.length);
            }
        } else {
            if (inputStream.available() > 0) {
                inputStream.read(buffer);
                outputStream1.write(buffer, 0, bufferFirstHalf.length);
                outputStream2.write(buffer, half+1, bufferSecondHalf.length);
            }
        }

        inputStream.close();
        outputStream1.close();
        outputStream2.close();
    }
}
