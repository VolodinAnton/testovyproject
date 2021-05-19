package com.company.MultithreadingQuest.HashCodeAndEquals;



public class Main {
    public static void main(String[] args) {
        /*Contact contact = new Contact("Василий Петров", 79622868052L);
        System.out.println(contact);
        Contact ivan = new Contact("Ivan Vasilyevich", 79639741121L);
        System.out.println(ivan);
        Contact vasyly = new Contact("Василий Петров", 79622868052L);

        System.out.println(contact.equals(vasyly));
*/
        Contact contact = new Contact("Vasya", 89622868052l);
        Contact contact1 = new Contact("Vasya", 89622868052l);
        System.out.println("ToSting " + contact);
        System.out.println(contact.hashCode());
        System.out.println(contact1.hashCode());
        System.out.println(contact.equals(contact1));

    }
}
