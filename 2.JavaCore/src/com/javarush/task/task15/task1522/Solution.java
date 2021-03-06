package com.javarush.task.task15.task1522;

/* 
Закрепляем паттерн Singleton
*/

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) {
        //System.out.println(thePlanet);
    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут

    static {
        readKeyFromConsoleAndInitPlanet();
    }



    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реализуйте задание №5 тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        try {
            s = reader.readLine();
        } catch (IOException e) {
            System.out.println(e);
        }

        switch (s) {
            case "sun":
                thePlanet = Sun.getInstance();
                break;
            case "moon":
                thePlanet = Moon.getInstance();
                break;
            case "earth":
                thePlanet = Earth.getInstance();
                break;
            default: thePlanet = null;
        }
    }
}
