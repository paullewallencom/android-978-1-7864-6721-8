package com.example.kyle.criteriapattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kyle on 31/07/2016.
 */
public class NonLocalFilter implements Filter {

    @Override
    public List<Ingredient> meetCriteria(List<Ingredient> ingredients) {

        List<Ingredient> nonLocal = new ArrayList<Ingredient>();

        for (Ingredient ingredient : ingredients) {
            if (ingredient.getLocal() != "locally produced") {
                nonLocal.add(ingredient);
            }
        }

        return nonLocal;
    }
}
