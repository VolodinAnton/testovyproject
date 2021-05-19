package com.company.ForSmallTests;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Svyaziv {
    public static void main(String[] args) {
        Collection c = new HashSet();
        print(c);
    }

    public static void print(Collection e) {
        System.out.println("Collection");
    }

    public static void print(Set s) {
        System.out.println("Set");
    }

    public static void print(HashSet hashSet) {
        System.out.println("HashSet");
    }
}
