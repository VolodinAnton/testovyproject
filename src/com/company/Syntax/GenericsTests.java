package com.company.Syntax;

import java.util.ArrayList;
import java.util.List;

public class GenericsTests<T extends Number> {
    T item;


    public static void main(String[] args) {
        GenericsTests<Integer> genericsTests = new GenericsTests<>();
        genericsTests.item = 1;
        System.out.println(genericsTests.item);
        System.out.println();

        GenericsTests<Float> genericsTests1 = new GenericsTests<>();
        genericsTests1.item = 1.0f;
        System.out.println(genericsTests1.item);
        System.out.println();

        GenericsTests genericsTests2 = new GenericsTests();
        genericsTests2.item = 1;
        genericsTests2.item = 1.0;
        genericsTests2.item = (short) 3;

        System.out.println(genericsTests2.item);
        System.out.println();



        List<? super Number> list = new ArrayList<>();
        list.add(10);
        list.add(9.12);
        list.add(8.3f);
        list.add((short) 3);

        System.out.println(list.get(0).getClass().getName());
        System.out.println(list.get(1).getClass());
        System.out.println(list.get(2).getClass());
        System.out.println(list.get(3).getClass());
        System.out.println();

        List<? extends Number> list1 = new ArrayList<>();
        ((List<Integer>)list1).add((int) 5);


        Box1<Box2> box = new Box1();

        box.setItemBox1(new Box2());
        box.getItemBox1().print();

    }
}


