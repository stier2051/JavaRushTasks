package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listEven = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //вводим путь и имя файла, с которого читаем данные
        String fileName = reader.readLine();

//        FileReader fileReader = new FileReader(fileName);//поток, который подключается к текстовому файлу
//        BufferedReader bR = new BufferedReader(fileReader);

//        String str;
//        while ((str = bR.readLine()) !=null) {
//            int number = Integer.parseInt(str);
//            list.add(number);
//        }
//        bR.close();

        InputStream inStream = new FileInputStream(fileName);
        BufferedReader bR = new BufferedReader((new InputStreamReader(inStream)));

        while (bR.ready()) {
            Integer x = Integer.parseInt(bR.readLine());
            if(x%2 == 0) {
                list.add(x);
            }
        }
        inStream.close();
        Collections.sort(list);
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
