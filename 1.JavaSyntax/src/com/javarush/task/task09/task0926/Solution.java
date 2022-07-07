package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        int[] array1 = new int[]{1,2,3,4,5};
        int[] array2 = new int[]{11,12};
        int[] array3 = new int[]{23,34,45,56};
        int[] array4 = new int[]{9,8,7,6,5,4,3};
        int[] array5 = new int[]{};

        ArrayList<int[]> list = new ArrayList<>();
        list.add(array1);
        list.add(array2);
        list.add(array3);
        list.add(array4);
        list.add(array5);
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
