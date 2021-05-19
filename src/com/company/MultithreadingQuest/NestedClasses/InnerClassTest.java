package com.company.MultithreadingQuest.NestedClasses;

public class InnerClassTest {
    public static void main(String[] args) {
        InnerClassTest.NestedClass nestedStaticClass = new InnerClassTest.NestedClass("Вложенный статический класс. Все статик классы называются вложенными");
        NestedClass nestedClass = new NestedClass("Все не статик классы называются внутренними");
        InnerClassTest.InnerClass innerClass = new InnerClassTest().new InnerClass("Чтобы создать Вложенный не статик класс вне пакета, то создаем через объект Внешнего кл");
    }

    private int a = 10;

    public class InnerClass {
        private String name;
        public InnerClass (String name) {
            this.name = name;
        }
    }

    public static class NestedClass {
        private String name;
        NestedClass (String name) {
            this.name = name;
        }
    }
}
