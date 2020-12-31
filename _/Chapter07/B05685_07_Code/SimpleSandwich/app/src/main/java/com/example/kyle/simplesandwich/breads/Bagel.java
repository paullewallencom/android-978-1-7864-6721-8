package com.example.kyle.simplesandwich.breads;


public class Bagel extends Bread {

    @Override
    public String description() {
        return "Bagel with ...";
    }

    @Override
    public int kcal() {
        return 250;
    }
}
