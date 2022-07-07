package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.*;

/* 
17.07.2020
Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit".
Передайте имя файла в нить ReadThread.
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки.


Требования:
1. Программа должна считывать имена файлов с консоли, пока не будет введено слово "exit".
2. Для каждого файла создай нить ReadThread и запусти ее.
3. После запуска каждая нить ReadThread должна создать свой поток для чтения из файла.
4. Затем нити должны найти максимально встречающийся байт в своем файле и добавить его в словарь resultMap.
5. Поток для чтения из файла в каждой нити должен быть закрыт.
*/

public class Solution {
    public volatile static Map<String, Integer> resultMap = new HashMap<String, Integer>();
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String file = reader.readLine();
            if (file.equals("exit")) {
                break;
            }
            ReadThread readThread = new ReadThread(file);
            readThread.start();
        }

        for (Map.Entry<String, Integer> pair : resultMap.entrySet()) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
    }

    public static class ReadThread extends Thread {
        String fileName;
        int max = 0;
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> repeatList = new ArrayList<>();
        Map<Integer, Integer> repeatMap = new TreeMap<>();
        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут

        @Override
        public void run() {
            try {
                FileInputStream inputStream = new FileInputStream(fileName);
                try {
                    byte[] buffer = new byte[inputStream.available()];
                    while (inputStream.available() > 0) {
                        int data = inputStream.read(buffer);
                    }

                    for (byte b : buffer) {
                        list.add((int) b);
                    }

                    for (int i = 0; i < list.size()-1; i++) {
                        count = 0;
                        for (int j = i+1; j < list.size(); j++) {
                            if (list.get(i).equals(list.get(j))) {
                                count++;
                                list.remove(j);
                                j--;
                            }
                        }
                        repeatMap.put(count, list.get(i));
                    }

                    for (Map.Entry<Integer, Integer> pair : repeatMap.entrySet()) {
                        repeatList.add(pair.getKey());
                    }

                    resultMap.put(fileName, repeatMap.get(repeatList.get(repeatList.size()-1)));
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
