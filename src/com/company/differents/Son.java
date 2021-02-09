package com.company.differents;

public class Son extends Mother {
    static {
        System.out.println("4 Static блок Нашего объекта запустился");
    }

    {
        System.out.println("4 Анонимный блок нашего объекта Сына от главного запустился");
    }

    public static String a = "4 Static Строка нашего объекта запустилась";
    public String b = "4 Простая Строка нашего объекта запустилась";

    public Son () {
        System.out.println("4 Конструктор нашего объекта заработал");
        Thread.currentThread().getName();
    }
}
