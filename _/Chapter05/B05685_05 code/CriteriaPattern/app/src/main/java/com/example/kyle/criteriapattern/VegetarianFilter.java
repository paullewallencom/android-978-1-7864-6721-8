package com.example.kyle.criteriapattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kyle on 31/07/2016.
 */
public class VegetarianFilter implements Filter {

    @Override
    public List<Ingredient> meetCriteria(List<Ingredient> ingredients) {

        List<Ingredient> vegetarian = new ArrayList<>();

        for (Ingredient ingredient : ingredients) {
            if (ingredient.isVegetarian()) {
                vegetarian.add(ingredient);
            }
        }

        return vegetarian;
    }
}
