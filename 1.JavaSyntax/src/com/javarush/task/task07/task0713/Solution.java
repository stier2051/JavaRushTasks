package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> subList3 = new ArrayList<Integer>();
        ArrayList<Integer> subList2 = new ArrayList<Integer>();
        ArrayList<Integer> subListOthers = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i=0; i<20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        for (int i=0; i<20; i++) {
            if (list.get(i)%3 == 0) subList3.add(list.get(i));
        }
        for (int i=0; i<20; i++) {
            if (list.get(i)%2 == 0) subList2.add(list.get(i));
        }
        for (int i=0; i<20; i++) {
            if (list.get(i)%3 != 0 && list.get(i)%2 != 0) subListOthers.add(list.get(i));
        }
        printList(list);
        printList(subList3);
        printList(subList2);
        printList(subListOthers);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
//        for (int i=0; i<subList3.size(); i++) {
//            System.out.println(subList3.get(i));
//        }
//        for (int i=0; i<subList2.size(); i++) {
//            System.out.println(subList2.get(i));
//        }
//        for (int i=0; i<subListOthers.size(); i++) {
//            System.out.println(subListOthers.get(i));
//        }
    }
}
