package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        int data;
        int count = 1;
        String strNumbers;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        StringBuffer sb = new StringBuffer();
        ArrayList<Double> listOfNumbers = new ArrayList<>();

        FileInputStream inputStream = new FileInputStream(fileName1);
        byte[] buffer = new byte[inputStream.available()];
        while (inputStream.available() > 0) {
            data = inputStream.read();
            //если считываемый байт это "пробел", парсим стрингбуффер в дробное число и добавляем в массив
            if (data == 32) {
                listOfNumbers.add(Double.parseDouble(sb.toString()));
                sb.setLength(0); //очищаем стрингбуффер
            } else if (count == buffer.length) {//если достигаем конца файла, то добавляем последний байт в стрингбуффер и парсим его
                sb.append((char)data);
                listOfNumbers.add(Double.parseDouble(sb.toString()));
                sb.setLength(0);
            } else {
                sb.append((char)data); //добавляем символ в стрингбуффер
            }
            count++; //включаем счетчик, чтобы понять когда достигли конца файла
        }
        inputStream.close();

        for (Double x : listOfNumbers) {
            sb.append(Math.round(x)).append(" "); //округляем до целого все знаяения в массиве и добавляем в стринбуффер
        }
        strNumbers = sb.toString(); //стрингбуффер переводим в стринг
        char[] charArray = strNumbers.toCharArray();//стринг переводим в массив символов
        FileOutputStream outputStream = new FileOutputStream(fileName2);
        for (int i = 0; i < charArray.length-1; i++) {
            outputStream.write((byte)charArray[i]);//записываем во второй файл байты
        }
        outputStream.close();
    }
}
