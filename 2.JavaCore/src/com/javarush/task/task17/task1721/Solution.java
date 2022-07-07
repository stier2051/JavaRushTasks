package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
@author Alex
@version dated 02.05.2020
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();


    public static void main(String[] args) throws CorruptedDataException {
        String firstFile = "";
        String secondFile ="";
        File file1, file2;
        BufferedReader br1 = null;
        BufferedReader br2 = null;
        String str ="";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFile = reader.readLine();
            secondFile = reader.readLine();

            file1 = new File(firstFile);
            file2 = new File(secondFile);
            br1 = new BufferedReader(new FileReader(file1));
            br2 = new BufferedReader(new FileReader(file2));

            while ((str = br1.readLine()) != null) {
                allLines.add(str);
            }

            while ((str = br2.readLine()) != null) {
                forRemoveLines.add(str);
            }
            reader.close();
            br1.close();
            br2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Solution solution = new Solution();
        solution.joinData();

    }

    public void joinData() throws CorruptedDataException {

        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            while (allLines.size() != 0) {
                allLines.remove(0);
            }
            throw new CorruptedDataException();
        }
    }
}
