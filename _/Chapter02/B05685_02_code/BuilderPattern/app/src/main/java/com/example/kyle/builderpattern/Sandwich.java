package com.example.kyle.builderpattern;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kyle on 27/07/2016.
 */
public class Sandwich {
    private static final String DEBUG_TAG = "tag";

    // Create list to hold ingredients
    private List<Ingredient> ingredients = new ArrayList<Ingredient>();

    // Calculate total calories
    public void getCalories() {
        int c = 0;

        for (Ingredient i : ingredients) {
            c += i.calories();
        }

        Log.d(DEBUG_TAG, "Total calories : " + c + " kcal");
    }

    // Add ingredient
    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    // Output ingredients
    public void getSandwich() {

        for (Ingredient i : ingredients) {
            Log.d(DEBUG_TAG, i.name() + " : " + i.calories() + " kcal");
        }
    }
}
