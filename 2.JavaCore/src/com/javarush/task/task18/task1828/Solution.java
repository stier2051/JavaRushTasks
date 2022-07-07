package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/* 
Прайсы 2
1. Программа должна считать имя файла для операций CrUD с консоли.
2. При запуске программы без параметров список товаров должен остаться неизменным.
3. При запуске программы с параметрами "-u id productName price quantity" должна обновится информация о товаре в файле.
4. При запуске программы с параметрами "-d id" строка товара с заданным id должна быть удалена из файла.
5. Созданные для файлов потоки должны быть закрыты.
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        String idString, productName, price, quantity;

        //если массив аргументов больше нуля, то запускаем программу
        if (args.length > 0) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
            //делим содержимое файла на строки и кладем их в список
            List<String> listOfLines = fileReader.lines().collect(Collectors.toList());
            fileReader.close();

            switch (args[0]) {
                case "-u":
                    productName = wordBuild(args[2], 30);
                    price = wordBuild(args[3], 8);
                    quantity = wordBuild(args[4], 4);

                    for (int i = 0; i < listOfLines.size(); i++) {
                        String idStringOfLine = listOfLines.get(i).substring(0, 8).trim();
                        if (idStringOfLine.equals(args[1])) {
                            idString = wordBuild(idStringOfLine, 8);
                            String updateLine = idString + productName + price + quantity;
                            listOfLines.remove(i);
                            listOfLines.add(i, updateLine);
                            break;
                        }
                    }
                    break;
                case "-d":
                    for (int i = 0; i < listOfLines.size(); i++) {
                        String idStringOfLine = listOfLines.get(i).substring(0, 8).trim();
                        if (idStringOfLine.equals(args[1])) {
                            listOfLines.remove(i);
                            break;
                        }
                    }
            }
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName));
            for(String lines : listOfLines) {
                fileWriter.write(lines + "\n");
            }
            fileWriter.close();
        }

    }
    //метод для формирования слова в зависимости от параметра и ограничений длины
    static String wordBuild (String word, int lengthLimit) {
        int originLength = word.length();
        if (originLength > lengthLimit) {
            word = word.substring(0, lengthLimit);
        } else {
            for (int i = 0; i < (lengthLimit - originLength); i++) {
                word = word.concat(" ");
            }
        }
        return word;
    }
}
