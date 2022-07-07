package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //Add your code here - добавьте свой код тут
        SpecialThread sThread1 = new SpecialThread();
        SpecialThread sThread2 = new SpecialThread();
        SpecialThread sThread3 = new SpecialThread();
        SpecialThread sThread4 = new SpecialThread();
        SpecialThread sThread5 = new SpecialThread();

        list.add(new Thread(sThread1));
        list.add(new Thread(sThread2));
        list.add(new Thread(sThread3));
        list.add(new Thread(sThread4));
        list.add(new Thread(sThread5));
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
