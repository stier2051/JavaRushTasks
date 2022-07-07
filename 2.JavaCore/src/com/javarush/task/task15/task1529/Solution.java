package com.javarush.task.task15.task1529;

/* 
Осваивание статического блока
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }

    static {
        //add your code here - добавьте код тут
        reset();
    }

    public static CanFly result;

    public static void reset() {
        //add your code here - добавьте код тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        try {
            str = reader.readLine();
        } catch (IOException e) {
            System.out.println(e);
        }
        switch (str) {
            case "helicopter" :
                result = new Helicopter();
                break;
            case "plane" :
                try {
                    String str1 = reader.readLine();
                    int passenger = Integer.parseInt(str1);
                    result = new Plane(passenger);
                } catch (IOException ee) {
                    System.out.println(ee);
                }
        }
        //System.out.println(result);
    }
}
