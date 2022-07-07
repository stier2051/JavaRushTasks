package com.javarush.task.task18.task1822;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* 
Поиск данных внутри файла
Требования:
1. Программа должна считать имя файла с консоли.
2. Создай для файла поток для чтения.
3. Программа должна найти в файле и вывести информацию о id, который передается первым параметром.
4. Поток для чтения из файла должен быть закрыт.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        List<String> list = fileReader.lines().collect(Collectors.toList());

        for (int i = 0; i < list.size(); i++) {
            String[] arr = list.get(i).split(" ");
            if (arr[0].equals(args[0])) {
                System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3]);
            }
        }
        fileReader.close();
//        String fileName;
//        String seachedLine = null; //искомая строка
//        int data;
//        int count = 0;
//
//        int id;
//        String productName;
//        double price;
//        int quantity;
//
//        ArrayList<String> listOfLines = new ArrayList<>();//список, куда будем класть строки из файла
//        ArrayList<String> listOfWords = new ArrayList<>();//список для слов из искомой строки
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();//для формирования строк из текста файла
//        StringBuilder sb1 = new StringBuilder();//для формирования слов из строки
//
//        fileName = reader.readLine();
//
//        FileInputStream inputStream = new FileInputStream(fileName); //поток чтения байт из файла
//        int l = inputStream.available();//измеряем длину файла (количество байтов)
//
//        //считываем из файла байты переводим их в символы и из символов собираем строку и кладем в список
//        while (inputStream.available() > 0) {
//            data = inputStream.read();
//            if (data != 10) {
//                char ch = (char)data;
//                sb.append(ch);
//            } else {
//                listOfLines.add(sb.toString());
//                sb = new StringBuilder();//после добавления одной строки, очищаем StringBuilder
//            }
//            if (count == l-1) {
//                listOfLines.add(sb.toString());
//            } //если чтение файла подходит к концу, добавляем последнюю строку в список (arraylist)
//            count++;
//        }
//        inputStream.close();
//        //ищем нужную строку из списка по аргументу
//        for (String line : listOfLines) {
//            int index = line.indexOf(' ');
//            String startOfLines = line.substring(0, index);
//            if (startOfLines.equals(args[0])) {
//                seachedLine = line;
//                break;
//            }
//        }
//        System.out.println(seachedLine);
        //строку разбиваем на слова и кладем в список
//        char[] lineArray = seachedLine.toCharArray();
//
//        for (int i = 0; i < lineArray.length; i++) {
//            if (lineArray[i] != 32) {
//                sb1.append(lineArray[i]);
//            } else {
//                listOfWords.add(sb1.toString());
//                sb1 = new StringBuilder();
//            }
//            if (i == lineArray.length-1) {
//                listOfWords.add(sb1.toString());
//            }
//        }
        //если наименование продукта состоит из нескольких слов, то определяем это и склеиваем слова
//        if (listOfWords.size() > 4) {
//            for (int i = 2; i < listOfWords.size() - 2; i++) {
//                listOfWords.set(1, listOfWords.get(1).concat(" " + listOfWords.get(i)));
//            }
//        }
//
//        id = Integer.parseInt(listOfWords.get(0));
//        productName = listOfWords.get(1);
//        price = Double.parseDouble(listOfWords.get(listOfWords.size()-2));
//        quantity = Integer.parseInt(listOfWords.get(listOfWords.size()-1).trim());
//        System.out.println(id + " " + productName + " " + price + " " + quantity);
//        System.out.println(id);
//        System.out.println(productName);
//        System.out.println(price);
//        System.out.println(quantity);
    }
}
