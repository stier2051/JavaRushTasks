package com.javarush.task.task19.task1904;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws ParseException, IOException {
        Scanner fileScanner = new Scanner(new File("C:\\users\\alex\\onedrive\\документы\\java_code\\files for tasks\\task1904.txt"));
        PersonScannerAdapter personScannerAdapter = new PersonScannerAdapter(fileScanner);
        Person ivan = personScannerAdapter.read();
        personScannerAdapter.close();
        System.out.println(ivan);
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws ParseException {
            String line = fileScanner.nextLine();
            String [] arr = line.split("\\s");
            String date = arr[3] + " " + arr[4] + " " + arr[5];
            SimpleDateFormat dateFormat = new SimpleDateFormat("d M yyyy");
            Date bDate = dateFormat.parse(date);
            return new Person(arr[1], arr[2], arr[0], bDate);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
