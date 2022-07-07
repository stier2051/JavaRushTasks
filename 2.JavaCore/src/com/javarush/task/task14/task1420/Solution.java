package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Solution {
    public static void main(String[] args) throws Exception {
        int a = 0;
        int b = 0;
        int c = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //возбуждаем исключения, если ввод был некорректным
        while(true) {
            try {
                a = Integer.parseInt(reader.readLine());
                b = Integer.parseInt(reader.readLine());
                if (a < 0 || b < 0) throw new correctEnterNumberException("Число должно быть положительным");
            } catch (NumberFormatException e) {
                System.out.println("Введен неверный формат");
            } catch (correctEnterNumberException e) {
                System.out.println(e.getMessage());
            }
            if (a > 0 && b > 0) break;
        }

        ArrayList<Integer> list1 = new ArrayList<>(factorization(a));
        ArrayList<Integer> list2 = new ArrayList<>(factorization(b));
        list1.retainAll(list2);

        //вычисляем наибольший общий делитель
        //if (list1.size() == 0) System.out.println("Наибольшего общего делителя нет!");
        if(list1.size() == 0) c = 1;
        if (list1.size() == 1) c = list1.get(0);
        if (list1.size() > 1) {
            deleteDuplicate(list1);
            c = list1.get(0);
            for (int i=0; i<list1.size()-1; i++) {
                c = c * list1.get(i+1);
            }
        }
        System.out.println(c);
    }
    //метод разложения на простые множители
    public static ArrayList<Integer> factorization (int x) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 2;
        do {
            if (x % i == 0) {
                x = x / i;
                list.add(i);
            } else i++;

        } while (x != 1);
        return list;
    }
    public static ArrayList<Integer> deleteDuplicate (ArrayList<Integer> list) {
        for (int i=0; i<list.size()-1; i++) {
            for (int j=i+1; j<list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;
                }
            }
        }
        return list;
    }
}

class correctEnterNumberException extends Exception {
    public correctEnterNumberException(String message) {
        super(message);
    }
}
