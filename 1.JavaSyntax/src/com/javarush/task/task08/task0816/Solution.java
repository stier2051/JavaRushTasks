package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Рембо", dateFormat.parse("JUNE 2 2011"));
        map.put("Николай", dateFormat.parse("NOV 15 1990"));
        map.put("Наталья", dateFormat.parse("JAN 12 1954"));
        map.put("Евгений", dateFormat.parse("FEB 23 1934"));
        map.put("Валентина", dateFormat.parse("MARCH 13 2001"));
        map.put("Асия", dateFormat.parse("JULY 11 1983"));
        map.put("Иван", dateFormat.parse("DECEMBER 11 2001"));
        map.put("Галия", dateFormat.parse("OCT 10 1981"));
        map.put("Дмитрий", dateFormat.parse("AUG 01 2005"));

//        for (Map.Entry<String, Date> pair : map.entrySet()) {
//            String key = pair.getKey();
//            Date value = pair.getValue();
//            int month = value.getMonth();
//            System.out.println(key + ":" + month);
//        }
        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            int month = pair.getValue().getMonth();
            if (month > 4 && month < 8) iterator.remove();
        }
    }

    public static void main(String[] args) {

    }
}
