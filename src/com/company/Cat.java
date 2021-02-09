package com.company;

public class Cat {
        public int age;
        public int weight;
        public int strength;

        public Cat() {
            System.out.println("Я кот"); // строчка для гита создана
            System.out.println("Еще одна строка для гита");
        }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int sum;
        int a = Integer.compare(this.age, anotherCat.age);
        int b = Integer.compare(this.strength, anotherCat.strength);
        int c = Integer.compare(this.weight, anotherCat.weight);
        sum = a+b+c;
        if (sum>0) return true;
        else return false;
    }
}
