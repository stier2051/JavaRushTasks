package com.javarush.task.task18.task1804;

/* 
Самые редкие байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> listOfBytes = new ArrayList<>();
        ArrayList<Integer> listOfUniqueBytes = new ArrayList<>();
        Map<Integer, Integer> mapOfRepeat = new HashMap<>();
        ArrayList<Integer> listOfMinBytes = new ArrayList<>();
        int count = 1;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        FileInputStream inputStream = new FileInputStream(file);
        while (inputStream.available() > 0) {
            listOfBytes.add(inputStream.read());
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
            mapOfRepeat.put(listOfBytes.get(i), count);
            listOfUniqueBytes.add(count);
            count = 1;
        }

        for (Map.Entry<Integer, Integer> pair : mapOfRepeat.entrySet()) {
            if(pair.getValue() == Collections.min(listOfUniqueBytes)) {
                listOfMinBytes.add(pair.getKey());
            }
        }

        for (Integer x : listOfMinBytes) {
            System.out.print(x + " ");
        }
    }
}
