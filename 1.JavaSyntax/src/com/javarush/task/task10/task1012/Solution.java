package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а','б','в','г','д','е','ё','ж',
                'з','и','й','к','л','м','н','о',
                'п','р','с','т','у','ф','х','ц',
                'ч','ш','щ','ъ','ы','ь','э','ю','я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // напишите тут ваш код
        Map<Character, Integer> mapChar = new HashMap<>();

        ArrayList<String> listChar = new ArrayList<>();

        int count = 0;

        String strAll = list.toString().replaceAll("\\p{Punct}","");
        char[] charArray = strAll.toCharArray();

        for (int i=0; i<alphabet.size(); i++) {
            for (int j=0; j<charArray.length; j++) {
                if (alphabet.get(i) == charArray[j]) {
                    count++;
                }
            }
            listChar.add(alphabet.get(i)+ " "+count);
            count = 0;
        }

        for (int i=0; i<listChar.size(); i++) {
            System.out.println(listChar.get(i));
        }

    }
}
