package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/* 
Прайсы
1. Программа должна считать имя файла для операций CrUD с консоли.
2. В классе Solution не должны быть использованы статические переменные.
3. При запуске программы без параметров список товаров должен остаться неизменным.
4. При запуске программы с параметрами "-c productName price quantity" в конец файла должна добавится новая строка с товаром.
5. Товар должен иметь следующий id, после максимального, найденного в файле.
6. Форматирование новой строки товара должно четко совпадать с указанным в задании.
7. Созданные для файлов потоки должны быть закрыты.
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        String idString, productName, price, quantity;
        //если массив аргументов больше нуля, то запускаем программу
        if (args.length > 0) {
            switch (args[0]) {
                case "-c":
                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                    String fileName = reader.readLine();
                    BufferedReader fileReader = new BufferedReader(new FileReader(fileName));

                    //делим содержимое файла на строки и кладем их в список
                    List<String> listOfLines = fileReader.lines().collect(Collectors.toList());
                    ArrayList<Integer> listOfId = new ArrayList<>();

                    //цикл отсечения id из строк и кладем их в отдельный список
                    for (String lines : listOfLines) {
                        String idStringOfLine = lines.substring(0, 8).trim();
                        int id = Integer.parseInt(idStringOfLine);
                        listOfId.add(id);
                    }
                    //для выявления максимального значения Id сортируем список
                    Collections.sort(listOfId);

                    fileReader.close();

                    //для определения нового Id прибавляем единицу к максимальному
                    int maxId = listOfId.get(listOfId.size()-1) + 1;

                    idString = Integer.toString(maxId);
                    productName = wordBuild(args[1], 30);
                    price = wordBuild(args[2], 8);
                    quantity = wordBuild(args[3], 4);
                    //соединаяем все в одну строку
                    String createLine = idString + productName + price + quantity;

                    BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName, true));

                    fileWriter.newLine();
                    fileWriter.write(createLine);
                    fileWriter.close();
                    break;
            }
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
