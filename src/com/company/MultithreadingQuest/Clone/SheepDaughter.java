package com.company.MultithreadingQuest.Clone;

public class SheepDaughter implements Cloneable{
    public String name;
    public int j;

    public SheepDaughter(String name, int j) {
        this.name = name;
        this.j = j;
    }

    @Override
    protected SheepDaughter clone() throws CloneNotSupportedException {
        return (SheepDaughter) super.clone();
    }
}
