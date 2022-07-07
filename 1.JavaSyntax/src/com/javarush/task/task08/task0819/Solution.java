package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {

    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        //напишите тут ваш код. step 3 - пункт 3
        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext()) {
            Cat catremove = iterator.next();
            iterator.remove();
            break;
        }
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> set = new HashSet<Cat>();
        for (int i=0; i<3; i++) set.add(new Cat());
        return set;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat catss : cats) {
            System.out.println(cats);
        }
    }

    public static class Cat {

    }
    // step 1 - пункт 1
}
