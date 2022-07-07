package com.javarush.task.task16.task1618;

/* 
Снова interrupt
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here - добавь код тут
        TestThread t = new TestThread();
        t.start();
        Thread.sleep(500);
        t.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread {
        TestThread() {

        }

        @Override
        public void run() {
            System.out.println("started");
            while(!interrupted()) {
                System.out.println("hello");
            }
            System.out.println("finished");
        }
    }
}