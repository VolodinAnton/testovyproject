package com.company.differents.Extend1;

public class Cleanser {
    public static void main(String[] args) {
        Cleanser cleanser = new Cleanser("Im cleanser");
        System.out.println(cleanser.cl);
        cleanser.printCleansil();
    }
    private String cl;
    public Cleanser(String cl) {
        this.cl = cl;
        System.out.println("Я из конструктора Клирсил с параметрами");
    }


    public void printCleansil() {
        System.out.println("Я метод Принт Клерсил из Класса Клирсил");
    }
}
