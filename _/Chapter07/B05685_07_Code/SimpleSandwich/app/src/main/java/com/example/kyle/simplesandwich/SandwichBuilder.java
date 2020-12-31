package com.example.kyle.simplesandwich;


import java.util.ArrayList;
import java.util.List;

public class SandwichBuilder {
    private List<Ingredient> ingredients = new ArrayList<Ingredient>();

    public Sandwich build(Sandwich sandwich, Ingredient ingredient) {
        sandwich.addIngredient(ingredient);
        return sandwich;
    }
}
