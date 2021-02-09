package com.company.differents;

public class ClassForConstructors {
    static {
        System.out.println("1 Static блок самого главного запустился");
    }

    {
        System.out.println("1 Анонимный блок самого галвного запустился");
    }

    public static String a = "1 Static Строка самого главного класса запустилась";
    public String b = "1 Простая строка самого главного класса запустилась";

    public ClassForConstructors () {
        System.out.println("1 Конструктор главного родителя запустился");
        Thread.currentThread().getName();
    }
}


