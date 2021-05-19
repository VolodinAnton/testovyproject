package com.company.MultithreadingQuest.Clone;

public class Sheep implements Cloneable {
    public String name;
    public int a;
    public SheepDaughter sheepDaughter;

    public Sheep(String name, int a, SheepDaughter sheepDaughter) {
        this.name = name;
        this.a = a;
        this.sheepDaughter = sheepDaughter;
    }

    @Override
    protected Sheep clone() throws CloneNotSupportedException {
        Sheep sheep = (Sheep)super.clone();
        sheep.sheepDaughter = sheepDaughter.clone();
        return sheep;
    }
}
