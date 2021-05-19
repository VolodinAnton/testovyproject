package com.company.MultithreadingQuest.NestedClasses;

//

public class ElectricCar {
    private int id;

    //1 тип: вложенный нестатический класс. Имеет доступ к полям основного класса
    // Обычно вне власса не используются, по этому приват. Их делают, когда главный класс сложный и часть логики надо реализовать отдельно
    //как машина и мотор (каждый сложный, но мотор вложен в машину).
    private class Motor {
        public void start() {
            System.out.println("Motor started");
        }

    }

    //2й тип: Статический вложенный класс.
    // Моменты: Не имеет доступа к нестатическим полям основного класса.
    public static class Battery {

    }


    public void start() {
        Motor motor = new Motor();
        motor.start();
        System.out.println("ElectricCar started");

        //3й тип вложенного класса: Вложенный в методе класс.
        // Имеет доступ к нестатич полям основного ласса, а так же к переменным метода к финальным
        //Это очень похоже на создание анонимных классов

        final int x = 11;

        class SomeClass {
            void SomeMehtod () {

            }
        }
    }

}
