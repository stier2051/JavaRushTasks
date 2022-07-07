package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(file1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file2));

        while (fileReader.ready()) {
            char ch = (char)fileReader.read();
            sb.append(ch);
        }
        fileReader.close();
        String text = sb.toString();
        Matcher matcher = Pattern.compile("\\p{P}").matcher(text);
        String result = matcher.replaceAll("");

        fileWriter.write(result);
        fileWriter.close();
    }
}
