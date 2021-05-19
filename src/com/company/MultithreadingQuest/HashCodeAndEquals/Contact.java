package com.company.MultithreadingQuest.HashCodeAndEquals;

public class Contact {
    static int id = 0;
    private String name;
    private long phoneNumber;

    public Contact (String name, long phoneNumber){
        id++;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (phoneNumber != contact.phoneNumber) return false;
        return name != null ? name.equals(contact.name) : contact.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (int) (phoneNumber ^ (phoneNumber >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Contact id № " + id +
                " name='" + name + '\'' +
                ", phoneNumber= +" + phoneNumber;
    }*/


}
