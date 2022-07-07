package com.javarush.task.task08.task0818;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        map.put("Александр", 120);
        map.put("Борис", 100);
        map.put("Валерий", 200);
        map.put("Гани", 600);
        map.put("Владимир", 700);
        map.put("Василий", 800);
        map.put("Инокентий", 250);
        map.put("Темирлан", 900);
        map.put("Олег", 300);
        map.put("Илья", 1100);

        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            if (pair.getValue() < 500) iterator.remove();
        }

//        for (Map.Entry<String, Integer> pair : map.entrySet()) {
//            System.out.println(pair.getKey() + " " + pair.getValue());
//        }
    }

    public static void main(String[] args) {
//        removeItemFromMap(createMap());
    }
}