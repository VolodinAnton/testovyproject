package com.company.InputOutput;

//Паттерн Декоратор
// Тест урока по этому видео https://www.youtube.com/watch?v=5CfXk62siuE

public class DecoratorTest {
}

interface Product {
    int getPrice();
}

class Milk implements Product {
    protected int price;

    public Milk (int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}

abstract class Decorator implements Product {
    final Product product;

    public Decorator(Product product) {
        this.product = product;
    }
}

class MilkDiscount extends Decorator {

    public MilkDiscount(Product product) {
        super(product);
    }

    @Override
    public int getPrice() {
        return this.product.getPrice() - 15;
    }

    public static void main(String[] args) {
        Milk milk = new Milk(100);
        MilkDiscount milkDiscount = new MilkDiscount(milk);
        System.out.println(milk.getPrice());
        System.out.println(milkDiscount.getPrice());
    }
}