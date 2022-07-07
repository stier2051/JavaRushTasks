package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        int [] array = new int [2];
        int i = 0;
        int c = 0;
        String s = null;

        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();

        String result = outputStream.toString();
        System.setOut(consoleStream);

        Matcher matcher1 = Pattern.compile("\\d+").matcher(result);
        while (matcher1.find()) {
            array[i] = Integer.parseInt(matcher1.group());
            i++;
        }

        Matcher matcher2 = Pattern.compile("[\\*+-]").matcher(result);
        while (matcher2.find()) {
            s = matcher2.group();
        }

        switch (s) {
            case "+": c = array[0] + array[1];
                System.out.println(array[0] + " + " + array[1] + " = " + c);
                break;
            case "-": c = array[0] - array[1];
                System.out.println(array[0] + " - " + array[1] + " = " + c);
                break;
            case "*": c = array[0] * array[1];
                System.out.println(array[0] + " * " + array[1] + " = " + c);
                break;
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

