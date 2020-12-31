package com.example.kyle.builderpattern.fillings;

import com.example.kyle.builderpattern.Ingredient;

/**
 * Created by kyle on 27/07/2016.
 */
public abstract class Filling implements Ingredient {

    @Override
    public abstract String name();

    @Override
    public abstract int calories();
}
