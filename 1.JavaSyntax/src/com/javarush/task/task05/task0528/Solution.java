package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/
import java.util.*;
import java.text.*;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Date dateToday = new Date();
        SimpleDateFormat formatDateToday = new SimpleDateFormat("dd MM yyyy");
        System.out.println(formatDateToday.format(dateToday));
    }
}
