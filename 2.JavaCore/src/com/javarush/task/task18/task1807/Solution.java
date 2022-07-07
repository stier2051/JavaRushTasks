package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception{
        ArrayList<Integer> listOfBytes = new ArrayList<>();
        int count = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();

        FileInputStream inputStream = new FileInputStream(filename);
        while (inputStream.available() > 0) {
            listOfBytes.add(inputStream.read());
        }
        inputStream.close();

        for (int i = 0; i < listOfBytes.size(); i++) {
            if (listOfBytes.get(i) == 44 || listOfBytes.get(i) == 130)
            count++;
        }

//        for (Integer x : listOfBytes) {
//            System.out.print(x+" ");
//        }
        System.out.println(count);
    }
}
