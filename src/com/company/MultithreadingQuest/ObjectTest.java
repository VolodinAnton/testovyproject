package com.company.MultithreadingQuest;

public class ObjectTest {
    public static void main(String[] args) {
        /*Object o = new Object();
        String a = "Vasya";
        String c = "abc".substring(2, 3);
        System.out.println(c);
        String d = "cde".substring(1, 2);
        System.out.println(d);*/

        MyObj obj = new MyObj();
        obj.i = 1;
        MyObj obj1 = obj;
        obj1.i = 564;

       //System.out.println(obj.i);

        Class clazz = obj.getClass();

        System.out.println(clazz.getSimpleName());
    }
}

class MyObj {
    int i;
}
