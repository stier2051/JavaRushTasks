package com.javarush.task.task19.task1907;

import java.io.*;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        FileReader fileReader = new FileReader(fileName);
        while (fileReader.ready()) {
            char data = (char)fileReader.read();
            sb.append(data);
        }
        fileReader.close();
        String [] arr = sb.toString().split("\\b[Ww]orld\\b");
        System.out.println(arr.length-1);
    }
}
