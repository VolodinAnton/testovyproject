package com.company.MultithreadingQuest.ComparableComparator;

import java.util.Comparator;

// Если класс не имплементит Comparable, то можно написать свой компаратор для этого класса и там реализовать логику сравнения
// Можно написать компаратор со специфическим сравнением и тд;

public class ComparatorTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Anton", 35, 51.1);
        Employee employee2 = new Employee("Anton", 35, 50.8);
        ComparatorEmployees com = new ComparatorEmployees();

        System.out.println(com.compare(employee1, employee2));

    }
}

class ComparatorEmployees implements Comparator<Employee> {
    public int compare(Employee a1, Employee a2) {
        int a = CharSequence.compare(a1.getName(), a2.getName());
        if (a == 0) {
            a = a1.getAge() - a2.getAge();
            if (a == 0) {
                a = Double.compare(a1.getSalary(), a2.getSalary());
            }
        }
        return a;
    }
}

class Employee {
    private String name;
    private int age;
    private Double salary;

    public Employee(String name, int age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
