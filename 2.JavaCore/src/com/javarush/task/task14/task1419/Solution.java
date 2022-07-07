package com.javarush.task.task14.task1419;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        try {
            String s = null;
            String m = s.toLowerCase();
        } catch (NullPointerException e) {
            exceptions.add(e);
        }

        try {
            int[] m = new int[2];
            m[3] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            ArrayList<String> list = new ArrayList<>();
            String s = list.get(19);
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            int a = Integer.parseInt("asd");
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }

        try {
            File file = new File("C://file.txt");
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }
        try {
            String a = "С праздником! Всего наилучшего";//длина 28
            char c = a.charAt(35); //доступ к 36 элементу
            System.out.println(c);
        } catch (StringIndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            int x = 50;
            if (x > 30) {
                throw new Exception("Число превышает 30");
            }
        }
        catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int x = 100;
            if (x > 50) {
                throw new incorrectNumberException("Число превышает 50");
            }
        }
        catch (incorrectNumberException e) {
            exceptions.add(e);
        }
        try {
            int x = 150;
            if (x > 100) {
                throw new myException("Число превышает 100");
            }
        }
        catch (myException e) {
            exceptions.add(e);
        }

    }
}
class incorrectNumberException extends Exception {
    public incorrectNumberException(String message) {
        super(message);
    }
}
class myException extends Exception {
    public myException(String message) {
        super(message);
    }
}
