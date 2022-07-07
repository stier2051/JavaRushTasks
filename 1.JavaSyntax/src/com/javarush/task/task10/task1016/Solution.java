package com.javarush.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Одинаковые слова в списке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        //напишите тут ваш код
        for (int i=0; i<list.size(); i++) {
            result.put(list.get(i), 0);
        }

        for (String word : list) {
            int number = 0;
            if(result.containsKey(word)) {
                number = result.get(word) + 1;
            }
            result.put(word, number);
        }
// ============= как вариант через метод getOrDefault ==========
//        for (String word : list) {
//            result.put(word, result.getOrDefault(word, 1) + 1); //если word нет в result возвращаем дефолтное значение, иначе прибавляем 1
//        }

        return result;
    }

}

