package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        FileReader fReader = new FileReader(file1);
        FileWriter fWriter = new FileWriter(file2);

        int count = 1;

        while (fReader.ready()) {
            int data = fReader.read();
            if (count % 2 == 0) {
                fWriter.write(data);
            }
            count++;
        }
        fReader.close();
        fWriter.close();
    }
}
