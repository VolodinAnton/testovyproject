package com.company;

public class Animal implements testInterface{
    int age;
    String name;


    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public void normDela() {
        System.out.println("Привет, я Энимал. У меня норм дела!");
    }
}
