package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    public static SimpleDateFormat dateFormatOut = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
    public static SimpleDateFormat dateFormatIn = new SimpleDateFormat("dd/MM/yyyy");

    static {
        allPeople.add(Person.createMale("Ivanov Ivan", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Petrov Petr", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        Person person;

        switch (args[0]) {
            case "-c":
                if (args[2].equals("м")) {
                    person = Person.createMale(args[1], parseDate(args[3]));
                } else {
                    person = Person.createFemale(args[1], parseDate(args[3]));
                }
                allPeople.add(person);
                System.out.println(allPeople.indexOf(person) );
                System.out.println(person.getName() + " " + sex(person) + " " + dateFormatOut.format(person.getBirthDate()));
                break;
            case "-u":
                person = allPeople.get(Integer.parseInt(args[1]));
                person.setName(args[2]);
                person.setSex(sexEnum(args[3]));
                person.setBirthDate(parseDate(args[4]));
                break;
            case "-d":
                person = allPeople.get(Integer.parseInt(args[1]));
                person.setName(null);
                person.setSex(null);
                person.setBirthDate(null);
                break;
            case "-i":
                person = allPeople.get(Integer.parseInt(args[1]));
                System.out.println(person.getName() + " " + sex(person) + " " + dateFormatOut.format(person.getBirthDate()));
                break;

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
