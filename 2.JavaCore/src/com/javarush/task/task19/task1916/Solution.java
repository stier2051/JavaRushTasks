package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        ArrayList<String> linesFile1 = new ArrayList<>();
        ArrayList<String> linesFile2 = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        BufferedReader fileReader1 = new BufferedReader(new FileReader(file1));
        BufferedReader fileReader2 = new BufferedReader(new FileReader(file2));

        while (fileReader1.ready()) {
            linesFile1.add(fileReader1.readLine());
        }
        while (fileReader2.ready()) {
            linesFile2.add(fileReader2.readLine());
        }

        fileReader1.close();
        fileReader2.close();

        for (int i = 0; i < linesFile1.size(); i++) {
            if (linesFile1.get(i).equals(linesFile2.get(i))) {
                LineItem lineItem = new LineItem(Type.SAME, linesFile1.get(i));
                lines.add(lineItem);
                System.out.println(lineItem.type + " " + lineItem.line);
            } else if (linesFile1.get(i+1).equals(linesFile2.get(i))) {
                LineItem lineItem = new LineItem(Type.REMOVED, linesFile1.get(i));
                lines.add(lineItem);
                linesFile2.add(i, "null");
                System.out.println(lineItem.type + " " + lineItem.line);
            } else {
                LineItem lineItem = new LineItem(Type.ADDED, linesFile2.get(i));
                lines.add(lineItem);
                linesFile1.add(i, "null");
                System.out.println(lineItem.type + " " + lineItem.line);
            }
        }

        if (linesFile2.size() > linesFile1.size()) {
            LineItem lineItem = new LineItem(Type.ADDED, linesFile2.get(linesFile2.size()-1));
            lines.add(lineItem);
            System.out.println(lineItem.type + " " + lineItem.line);
        }
//        if (linesFile1.size() > linesFile2.size()) {
//            LineItem lineItem = new LineItem(Type.REMOVED, linesFile1.get(linesFile1.size()-1));
//            System.out.println(lineItem.type + " " + lineItem.line);
//        }
    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
