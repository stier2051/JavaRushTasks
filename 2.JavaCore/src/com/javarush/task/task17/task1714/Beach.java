package com.javarush.task.task17.task1714;

/* 
Comparable
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach (String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {
        List<Beach> beaches = new ArrayList<>();

        Beach beachOne = new Beach("one", 15.4f, 5);
        Beach beachTwo = new Beach("two", 20.5f, 8);
        Beach beachThree = new Beach("three", 4f, 16);

        beaches.add(beachOne);
        beaches.add(beachTwo);
        beaches.add(beachThree);

        Collections.sort(beaches);
        System.out.println(beaches);
    }

    @Override
    public synchronized int compareTo(Beach o) {
        int d = (int)this.getDistance() - (int)o.getDistance();
        int q = o.getQuality() - this.getQuality();
        return d + q;
    }

    public synchronized String toString() {
        String text = this.name + " " + this.distance + " " + this.quality;
        return text;
    }
}
