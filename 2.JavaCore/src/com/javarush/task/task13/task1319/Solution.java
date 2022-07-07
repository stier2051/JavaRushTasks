package com.javarush.task.task13.task1319;

import java.io.*;
//import java.lang.reflect.InaccessibleObjectException;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();

        FileWriter filewriter = new FileWriter(file);//поток, который подключается к текстовому файлу
        //BufferedWriter записывает текст в поток вывода символов, буферизуя записанные символы, чтобы обеспечить
        //эффективную заипсь символов, массивов и строк. Можно указать вторым параметром размер буфера.
        BufferedWriter bW = new BufferedWriter(filewriter);

        while (true) {
            String str1 = reader.readLine();
            bW.write(str1 + "\n");
            if (str1.equals("exit")) { break; }
        }
        bW.close();

    }
}
