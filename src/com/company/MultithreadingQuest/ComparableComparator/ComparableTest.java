package com.company.MultithreadingQuest.ComparableComparator;

public class ComparableTest implements Comparable<ComparableTest>{  // обратить внимание, что при реализации Comparable нужно прописать тип объектов, с которыми будет метод работать.
    private String name;
    private int age;

    public ComparableTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(ComparableTest o) {
        int a = this.name.compareTo(o.name);   // при сравнении примитивных типов, можно использовать уже реализованые методы из их Оберток
        if (a == 0) a = this.age - o.age;      // здесь моя реализация, простое вычитание
        return a;

    }

    public static void main(String[] args) {
        ComparableTest firstMan = new ComparableTest("Anton", 35);
        ComparableTest secondMan = new ComparableTest("Anton", 35);
        System.out.println(firstMan.compareTo(secondMan));
    }
}
