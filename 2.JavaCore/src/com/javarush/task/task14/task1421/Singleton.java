package com.javarush.task.task14.task1421;

class Singleton {
    private static Singleton instance;

    //инкапсулируем конструктор (делаем приватным)
    private Singleton() { }

    public static Singleton getInstance() {
        if (instance == null) instance = new Singleton();
        return instance;
    }
}
