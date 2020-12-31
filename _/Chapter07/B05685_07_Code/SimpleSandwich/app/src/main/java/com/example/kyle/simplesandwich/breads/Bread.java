package com.example.kyle.simplesandwich.breads;

import com.example.kyle.simplesandwich.Ingredient;

public abstract class Bread implements Ingredient {

    String decoration;
    int decorationKcal;

    public String getDecoration() {
        return decoration;
    }

    public int getDecorationKcal() {
        return decorationKcal;
    }
}
