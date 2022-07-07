package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int number1 = Math.abs(number/100);
        int number2 = Math.abs((number % 100)/10);
        int number3 = (number % 100) % 10;
        return number1 + number2 + number3;
    }
}