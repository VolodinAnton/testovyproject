package com.company;

public class Man implements testInterface {
    String name;
    boolean married;

    public Man(String name, boolean married) {
        this.name = name;
        this.married = married;
    }

    @Override
    public void normDela() {
        System.out.println("Привет я " + name + ". У меня дела отлично!");
    }
}
