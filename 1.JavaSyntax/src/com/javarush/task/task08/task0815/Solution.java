package com.javarush.task.task08.task0815;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        map.put("Иванов", "Евгений");
        map.put("Батталханов", "Бакберген");
        map.put("Жапарова", "Карина");
        map.put("Шарипов", "Нургали");
        map.put("Смаилова", "Мадина");
        map.put("Туймебаев", "Нургали");
        map.put("Красотов", "Вадим");
        map.put("Жигулина", "Татьяна");
        map.put("Ульшина", "Марина");
        map.put("Мун", "Александр");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> entry: map.entrySet()) {
            if (entry.getValue().equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
       int count = 0;
       for (Map.Entry<String, String> entry: map.entrySet()) {
           if (entry.getKey().equals(lastName)) {
               count++;
           }
       }
       return count;
    }

    public static void main(String[] args) {

    }
}
