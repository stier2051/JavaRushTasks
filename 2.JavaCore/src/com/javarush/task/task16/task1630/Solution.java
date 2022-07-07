package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {

        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        //add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public  static class ReadFileThread extends Thread implements ReadFileInterface {
        File file;
        BufferedReader br;
        String fullS = "", st;
        InputStream inStream;
        int data;

        @Override
        public void setFileName(String fullFileName) {
            file = new File(fullFileName);
        }

        @Override
        public String getFileContent() {
            return fullS;
        }

        @Override
        public void run() {

            try {
                br = new BufferedReader(new FileReader(file));
            } catch (FileNotFoundException e) {}

            try {
                while ((st = br.readLine()) !=null) {
                    fullS = fullS + " " + st;
                }
            } catch (IOException e) {

            }
        }
    }
}
