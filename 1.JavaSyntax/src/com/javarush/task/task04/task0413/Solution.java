package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sDay = reader.readLine();
        int nDay = Integer.parseInt(sDay);

        switch (nDay) {
            case 1: System.out.println("понедельник");
                break;
            case 2: System.out.println("вторник");
                break;
            case 3: System.out.println("среда");
                break;
            case 4: System.out.println("четверг");
                break;
            case 5: System.out.println("пятница");
                break;
            case 6: System.out.println("суббота");
                break;
            case 7: System.out.println("воскресенье");
                break;
        }
        if (nDay < 1 | nDay > 7 ) {
            System.out.println("такого дня недели не существует");
        }
    }
}