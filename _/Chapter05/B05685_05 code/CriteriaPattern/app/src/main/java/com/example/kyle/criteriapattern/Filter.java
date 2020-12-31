package com.example.kyle.criteriapattern;

import java.util.List;

/**
 * Created by kyle on 31/07/2016.
 */
public interface Filter {

    List<Ingredient> meetCriteria(List<Ingredient> ingredients);
}
