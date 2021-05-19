package com.company.MultithreadingQuest.NestedClasses;

public class AnonymousClassFromJR {
    private String name;

    AnonymousClassFromJR(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void sout() {
        new AnonymousClassFromJR("The Darkside Hacker") {
            void printName() {
                System.out.println(getName());
            }
        }.printName();
    }

    public static void main(String[] args) {
        new AnonymousClassFromJR("Риша").sout();
    }
}

