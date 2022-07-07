package com.javarush.task.task18.task1805;

/* 
Сортировка байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> listOfAllBytes = new ArrayList<>();
        ArrayList<Integer> finalList = new ArrayList<>();

        BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        FileInputStream inputStream = new FileInputStream(filename);
        while (inputStream.available() > 0) {
            listOfAllBytes.add(inputStream.read());
        }
        inputStream.close();
        for (int i = 0; i < listOfAllBytes.size(); i++) {
            for (int j = i+1; j < listOfAllBytes.size(); j++) {
                if (listOfAllBytes.get(i) == listOfAllBytes.get(j)) {
                    listOfAllBytes.remove(j);
                    j--;
                }
            }
        }
       Collections.sort(listOfAllBytes);

        for (Integer x : listOfAllBytes) {
            System.out.print(x + " ");
        }
    }
}
