package com.example.kyle.criteriapattern;

import java.util.List;

/**
 * Created by kyle on 31/07/2016.
 */
public class AndCriteria implements Filter {
    Filter criteria;
    Filter otherCriteria;

    public AndCriteria(Filter criteria, Filter otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Ingredient> meetCriteria(List<Ingredient> ingredients) {
        List<Ingredient> firstCriteria = criteria.meetCriteria(ingredients);

        return otherCriteria.meetCriteria(firstCriteria);
    }
}
