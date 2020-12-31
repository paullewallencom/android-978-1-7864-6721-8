package com.example.kyle.criteriapattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by kyle on 31/07/2016.
 */
public class LocalFilter implements Filter {

    @Override
    public List<Ingredient> meetCriteria(List<Ingredient> ingredients) {

        List<Ingredient> local = new ArrayList<Ingredient>();

        for (Ingredient ingredient : ingredients) {
            if (Objects.equals(ingredient.getLocal(), "locally produced")) {
                local.add(ingredient);
            }
        }

        return local;
    }
}
