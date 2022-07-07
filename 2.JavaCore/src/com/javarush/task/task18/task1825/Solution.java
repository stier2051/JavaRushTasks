package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int count = 0;
        ArrayList<String> listOfFiles = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String fileName = reader.readLine();
            if (fileName.equals("end")) break;
            listOfFiles.add(fileName);
        }

        Collections.sort(listOfFiles);//сортируем наименования файлов

        for (String x : listOfFiles) {

            FileInputStream inputStream = new FileInputStream("C:/users/alex/onedrive/документы/java_code/files for tasks/task1825.txt");
            int offset = inputStream.available();
            inputStream.close();
            System.out.println(offset);

            FileOutputStream outputStream = new FileOutputStream("C:/users/alex/onedrive/документы/java_code/files for tasks/task1825.txt");
            FileInputStream inputStream1 = new FileInputStream(x);
            byte[] buffer = new byte[inputStream1.available()];

            while (inputStream1.available() > 0) {
                count = inputStream1.read(buffer);
                System.out.println(offset);
//                if (offset > 0) offset++;
                outputStream.write(buffer, inputStream.available(), count);
            }
            inputStream1.close();
            outputStream.close();
        }
    }
}
