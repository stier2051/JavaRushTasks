package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int id;
        String name;
        HashMap<String, Integer> map = new HashMap<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String idS = reader.readLine();
            if (idS.isEmpty()) break;
            id = Integer.parseInt(idS);
            name = reader.readLine();
            if (name.isEmpty()) {
                map.put(name, id);
                break;
            }


            map.put(name, id);
        }

        for(Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(value+ " " +key);
        }

        //System.out.println("Id=" + id + " Name=" + name);
    }
}
