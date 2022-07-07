package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename;

        while (true) {
            filename = reader.readLine();
            FileInputStream inputStream = new FileInputStream(filename);
            byte[] buffer = new byte[inputStream.available()];
            if (buffer.length < 1000) {
                inputStream.close();
                throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}
