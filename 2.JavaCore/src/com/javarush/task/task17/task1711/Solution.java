package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();
    public static Person person;

    public static SimpleDateFormat dateFormatOut = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
    public static SimpleDateFormat dateFormatIn = new SimpleDateFormat("dd/MM/yyyy");

    static {
        allPeople.add(Person.createMale("Ivanov Ivan", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Petrov Petr", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут


        switch (args[0]) {
            case "-c": synchronized (allPeople) {
                create(args);
            }   break;
            case "-u": synchronized (allPeople) {
                update(args);
            }   break;
            case "-d": synchronized (allPeople) {
                delete(args);
            } break;
            case "-i": synchronized (allPeople) {
                info(args);
            } break;

        }
    }

    public static void create(String[] args) {
        for (int i = 1; i < args.length; i += 3) {
            if (args[i+1].equals("м")) {
                person = Person.createMale(args[i], parseDate(args[i+2]));
            } else {
                person = Person.createFemale(args[i], parseDate(args[i+2]));
            }
            allPeople.add(person);
            System.out.println(allPeople.indexOf(person) );
        }
    }

    public static void update(String[] args) {
        for (int i = 1; i < args.length; i += 4) {
            person = allPeople.get(Integer.parseInt(args[i]));
            person.setName(args[i+1]);
            person.setSex(sexEnum(args[i+2]));
            person.setBirthDate(parseDate(args[i+3]));
        }
    }

    public static void delete(String[] args) {
        for (int i = 1; i < args.length; i++) {
            person = allPeople.get(Integer.parseInt(args[i]));
            person.setName(null);
            person.setSex(null);
            person.setBirthDate(null);
        }
    }

    public static void info(String[] args) {
        for (int i = 1; i < args.length; i++) {
            person = allPeople.get(Integer.parseInt(args[i]));
            System.out.println(person.getName() + " " + sex(person) + " " + dateFormatOut.format(person.getBirthDate()));
        }

    }

    //конвертируем энам в стринг
    public static String sex(Person person) {
        return person.getSex().equals(Sex.FEMALE) ? "ж" : "м";
    }
    //конвертируем стрингв энам
    public static Sex sexEnum(String sex) {
        return sex.equals("м") ? Sex.MALE : Sex.FEMALE;
    }
    //конвертируем дату в Date
    public static Date parseDate(String bDate) {
        Date result = null;
        try {
            result = dateFormatIn.parse(bDate);
        } catch (ParseException e) {

        }
        return result;
    }

}
