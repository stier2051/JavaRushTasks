package com.javarush.task.task18.task1803;

/* 
Самые частые байты
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
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> maxByte = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        int data;
        int count = 1;

        FileInputStream inputStream = new FileInputStream(file);
        while (inputStream.available() > 0) {
            data = inputStream.read();
            list.add(data);
        }
        inputStream.close();
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    count++;
                    list.remove(j);
                    j--;
                }
            }
            list1.add(count);
            map.put(list.get(i), count);
            count = 1;
        }
        int maxRep = Collections.max(list1);
        for (Map.Entry<Integer, Integer> pair : map.entrySet()){
            if (pair.getValue() == maxRep) {
                maxByte.add(pair.getKey());
            }
        }
        for(Integer x : maxByte) {
            System.out.print(x+" ");
        }
    }
}
