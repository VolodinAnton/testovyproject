package com.company.Syntax;

import java.util.ArrayList;
import java.util.List;

public class GenericsTests {
    public static void main(String[] args) {
        List<? extends Number> list = new ArrayList<>();
        list.add(0b1000);
    }
}


