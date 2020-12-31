package com.example.kyle.simplesandwich;

public class Salt implements Ingredient {

    @Override
    public String description() {
        return "Salt";
    }

    @Override
    public int kcal() {
        return 0;
    }
}
