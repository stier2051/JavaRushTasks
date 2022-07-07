package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String fileName = args[0];
        int count = 1;
        ArrayList<Integer> listOfBytes = new ArrayList<>();
        Map<Character, Integer> treeMap = new TreeMap<>();
        FileInputStream inputStream = new FileInputStream(fileName);

        while (inputStream.available() > 0) {
           int data = inputStream.read();
           listOfBytes.add(data);
        }
        inputStream.close();

        for (int i = 0; i < listOfBytes.size(); i++) {
            for (int j = i+1; j < listOfBytes.size(); j++) {
                if (listOfBytes.get(i) == listOfBytes.get(j)) {
                    count++;
                    listOfBytes.remove(j);
                    j--;
                }
            }
            int ch = listOfBytes.get(i);
            treeMap.put((char)ch, count);
            count = 1;
        }
        for (Map.Entry<Character, Integer> pair : treeMap.entrySet()) {
            System.out.println(pair.getKey()+ " " + pair.getValue());
        }
    }
}
