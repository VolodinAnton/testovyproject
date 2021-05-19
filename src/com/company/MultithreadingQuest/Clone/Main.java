package com.company.MultithreadingQuest.Clone;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("Овечка", 1, new SheepDaughter("Дочка оригинальной овцы", 3));
        Sheep sheepClone = sheep.clone();
        sheepClone.sheepDaughter.j = 74;
        System.out.println(sheep.sheepDaughter.j);
        System.out.println(sheepClone.sheepDaughter.j);
    }
}
