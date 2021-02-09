package com.company.differents;

public class Mother extends GrandFa {
    static {
        System.out.println("3 Static блок Мамы Третьей от главного запустился");
    }

    {
        System.out.println("3 Анонимный блок Мамы Третьей от главного запустился");
    }

    public static String a = "3 Static Строка Мамы Третьей от главного класса запустилась";
    public String b = "3 Простая Строка Мамы Третьей от главного класса запустилась";

    public Mother () {
        System.out.println("Коструктор мамы заработал Третий после главного");
        Thread.currentThread().getName();
    }
}
