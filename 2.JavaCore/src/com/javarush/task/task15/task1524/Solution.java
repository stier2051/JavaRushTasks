package com.javarush.task.task15.task1524;

/* 
Порядок загрузки переменных
*/

public class Solution {
    static {
        init();//вызываем №2
    }

    static {
        System.out.println("Static block"); //#1
    }

    //нестатический блок
    {
        System.out.println("Non-static block");//#4
        printAllFields(this);//запускаем #5,6 - переменная name еще не инициализирована, 7 - переменная i еще не инициализирована
    }

    public int i = 6;

    public String name = "First name";//#10

    public Solution() {
        System.out.println("Solution constructor");//#8
        printAllFields(this);
    }

    public static void init() {
        System.out.println("static void init()");
    } //#2

    public static void main(String[] args) {
        System.out.println("public static void main"); //#3
        Solution s = new Solution();
    }

    public static void printAllFields(Solution obj) {
        System.out.println("static void printAllFields");//#5,9
        System.out.println(obj.i);
        System.out.println(obj.name);
    }
}
