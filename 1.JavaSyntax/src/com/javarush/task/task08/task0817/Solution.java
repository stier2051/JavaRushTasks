package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Ивановсидоров", "Александр");
        map.put("Ивановсидоро", "Борис");
        map.put("Ивановсидор", "Валерий");
        map.put("Ивановсидо", "Александр");
        map.put("Ивановсид", "Борис");
        map.put("Ивановси", "Василий");
        map.put("Ивановс", "Борис");
        map.put("Иванов", "Темирлан");
        map.put("Ивано", "Олег");
        map.put("Иван", "Александр");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        for (Map.Entry<String, String> pair : map.entrySet()) {
            String value = pair.getValue();
            list.add(value);
        }
        for (int i=0; i<list.size()-1; i++) {
            int repeat = 0;

            for (int j=i+1; j<list.size(); j++) {
                if (list.get(i).equals(list.get(j))) repeat++;
            }
            if (repeat > 0) {
                removeItemFromMapByValue(map,list.get(i));
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
    }
}
