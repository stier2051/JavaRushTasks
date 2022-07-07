package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new MyThreadOne());
        threads.add(new MyThreadTwo());
        threads.add(new MyThreadThree());
        threads.add(new MyThreadFour());
        threads.add(new MyThreadFive());
    }

    public static void main(String[] args) {
        for (int i = 0; i < threads.size(); i++) {
            threads.get(i).start();
        }
    }

    public static class MyThreadOne extends Thread {
        public void run() {
            while (true) {

            }
        }
    }

    public static class MyThreadTwo extends Thread {
        int minus;
        public void run() {
            try {
                while (isInterrupted()) {
                    minus--;
                    Thread.sleep(1);
                }
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class MyThreadThree extends Thread {

        public void run() {
            while (true) {
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }

    public static class MyThreadFour extends Thread implements Message {

        boolean isStop = false;
        int count;

        public void showWarning() {
            if (this.isAlive()) isStop = true;
        }

        public void run() {
            while (!isStop) {
                count++;
            }
        }
    }

    public static class MyThreadFive extends Thread {
        int summ;
        String str;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        public void run() {
            while (true) {
               try {
                   str = reader.readLine();
               } catch (IOException e) {
               }
               if (str.equals("N")) break;
               summ = summ + Integer.parseInt(str);;
            }
            System.out.println(summ);
        }
    }
}