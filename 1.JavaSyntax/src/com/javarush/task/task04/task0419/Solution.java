package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = reader.readLine();
        String number2 = reader.readLine();
        String number3 = reader.readLine();
        String number4 = reader.readLine();

        int number11 = Integer.parseInt(number1);
        int number22 = Integer.parseInt(number2);
        int number33 = Integer.parseInt(number3);
        int number44 = Integer.parseInt(number4);

        if (number11>=number22 & number11>=number33 & number11>=number44) {
            System.out.println(number11);
        } else if (number22>=number11 & number22>=number33 & number22>=number44) {
            System.out.println(number22);
        } else if (number33>=number11 & number33>=number22 & number33>=number44) {
            System.out.println(number33);
        } else if (number44>=number11 & number44>=number22 & number44>=number33) {
            System.out.println(number44);
        } else {
            int number = number11 | number22 | number33 | number44;
        }
    }
}
