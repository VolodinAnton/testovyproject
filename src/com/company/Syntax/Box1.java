package com.company.Syntax;

public class Box1<T extends Box> extends Box{
    private T itemBox1;

    public T getItemBox1() {
        return itemBox1;
    }

    public void setItemBox1(T itemBox1) {
        this.itemBox1 = itemBox1;
    }
}
