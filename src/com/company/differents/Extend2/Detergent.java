package com.company.differents.Extend2;

import com.company.differents.Extend1.Cleanser;

public class Detergent extends Cleanser {
    public static void main(String[] args) {
        Detergent detergent = new Detergent("Im detergent");
        detergent.printCleansil();

    }
    public Detergent(String cl) {
        super(cl);
        super.printCleansil();
    }

    @Override
    public void printCleansil() {
        System.out.println("Я переопределенный метод ПринтКлирсил. Нахожусь в классе Детергент");
    }
}
