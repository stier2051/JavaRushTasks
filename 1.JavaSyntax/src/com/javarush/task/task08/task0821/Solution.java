package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Василий");
        map.put("Сидоров", "Василий");
        map.put("Караченцев", "Николай");
        map.put("Бретт", "Пит");
        map.put("Бретт", "Джон");
        map.put("Михалков", "Никита");
        map.put("Шварцнеггер", "Арнольд");
        map.put("Сталлоне", "Сильвестер");
        map.put("Сталлоне", "Сандра");
        map.put("Ли", "Джет");
        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
