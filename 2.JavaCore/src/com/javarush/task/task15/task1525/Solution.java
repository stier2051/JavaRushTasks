package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();
    static {
        String line;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(Statics.FILE_NAME));
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        try {
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println(e);
        }


    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
