package com.company.differents.Extend3;

public class Animal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Zhuchka";
        System.out.println(dog.name);
        Animal animal = new Animal();
        System.out.println(animal.name);
        Chappi chappi = new Chappi();
        System.out.print("Chappi ");
        chappi.fuck();

        Animal chappi2 = new Chappi();
        System.out.print("Chappi2 ");
        chappi2.fuck();
        System.out.println(chappi2.name);

        WhiteWine whiteWine = new WhiteWine();
        System.out.print("Field from WhiteVine ");
        System.out.println(whiteWine.testVine);

        WhiteWine sweetWhiteWine = new SweetWhiteWine();
        sweetWhiteWine.method();
        System.out.println(sweetWhiteWine.getClass());

        Object obj = new Object();
        System.out.println(obj.getClass());

        Fluffie fluffie = new Fluffie();
        System.out.print("I'm print from object Fluffie ");
        fluffie.whuffieMethod();

        BooInharitor booInharitor = new BooInharitor("NameBOOInharitor", 50);
        Boo boo = new Boo();
        System.out.println(boo.name);
    }

    String name;
/*
    public Animal (String name) {
        this.name = name;
    }*/

    public void fuck() {
        System.out.println("Animal roaming");
    }
}

class Dog extends Animal {
    public void fuck() {
        System.out.println("Dog roaming");
    }
}

class Chappi extends Dog {
    @Override
    public void fuck() {
        super.fuck();
    }

    public void methodOnlyForChappi () {
        System.out.println("methodOnlyForChappi");
    }
}

abstract class Vine {
    String testVine;

    public void makeVine() {
        System.out.println("I make vine from abstract class");
    }

    public abstract void methodAbstract();
}

class WhiteWine extends Vine {
    public WhiteWine () {
        System.out.println("Constructor WhiteWine");
    }

    @Override
    public void methodAbstract() {
        System.out.println("I implemented abstract method from White Wine");
    }

    public void method() {
        System.out.println("I from White Wine just method");
    }
}

class SweetWhiteWine extends WhiteWine {
    public SweetWhiteWine () {
        super();
    }

    @Override
    public void method() {

        super.method();
        System.out.println("I from Sweet White Wine just method");
    }
}

interface Whuffie {
    void whuffieMethod ();
}

abstract class Muffie implements Whuffie {
    public void whuffieMethod() {
        System.out.println("whuffieMethod");
    }
}

class Fluffie extends Muffie {

}


class Boo {
    String name;
    int age;
    String sex;

    Boo  () {

    }

    Boo (String name, int age) {
        this.name = name;
        this.age = age;
        sex = "man";
    }

    Boo (String name, int age, String sex) {
        this(name, age);
        this.sex = sex;
    }

    void print (String s) {
        System.out.println(s);
    }
}

class BooInharitor extends Boo {
    BooInharitor (String a, int b) {
        super(a, b);
    }
}