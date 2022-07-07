package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String len = reader.readLine();
        int leng = len.length();

        char[] charArray = new char[leng];
        int[] numberArray = new int[leng];


        for (int i=0; i<leng; i++) {
            charArray[i] = len.charAt(i);
            numberArray[i] = Character.digit(charArray[i],10);
            if (numberArray[i]%2 == 0) even++;
            else odd++;
        }
        System.out.println("Even: " + even +" Odd: "+ odd);
    }
}
