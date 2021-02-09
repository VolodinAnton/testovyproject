package com.company.differents;

public class GrandFa extends ClassForConstructors {

    public GrandFa () {
        System.out.println("2 Конструкторк Деда заработал Второй после Главного");
        Thread.currentThread().getName();
    }
}
