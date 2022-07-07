package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        StringBuilder sb1 = new StringBuilder();//для формирования строки из символов из файла
        StringBuilder sb2 = new StringBuilder();//для формирования строки из найденных стрингов
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(file1));

        //считываем файл посимвольно и собираем в строку
        while (fileReader.ready()) {
            char ch = (char)fileReader.read();
            sb1.append(ch);
        }
        fileReader.close();
        String text = sb1.toString();
        Matcher matcher = Pattern.compile("\\b\\d+\\b").matcher(text);

        //собираем строку после фильтрации
        while (matcher.find()) {
            sb2.append(matcher.group());
            sb2.append(" ");
        }
        String textCleaned = sb2.toString().trim();

        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file2));
        fileWriter.write(textCleaned);
        fileWriter.close();
    }
}
