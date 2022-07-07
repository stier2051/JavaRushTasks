package com.javarush.task.task15.task1527;

/* 
Парсер реквестов
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //add your code here
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();

        String url = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            url = reader.readLine();
        } catch (IOException e) {
            System.out.println(e);
        }

        String[] subUrl = url.split("\\?");
        String[] subUrl1 = subUrl[1].split("&");
        String[] subUrl2;

        double objValue = 0;

        for (String s : subUrl1) {
            subUrl2 = s.split("=");
            list.add(subUrl2[0]);
            //list1.add(subUrl2[1]);
        }

        for (String text : list) {
            System.out.print(text + " ");
        }
        System.out.println();
        for (int i=0; i<list.size(); i++) {

            subUrl2 = subUrl1[i].split("=");

            if(list.get(i).equals("obj")) {
                try{
                    objValue = Double.parseDouble(subUrl2[1]);
                    alert(objValue);
                } catch (NumberFormatException e) {
                    String value = subUrl2[1];
                    alert(value);
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
