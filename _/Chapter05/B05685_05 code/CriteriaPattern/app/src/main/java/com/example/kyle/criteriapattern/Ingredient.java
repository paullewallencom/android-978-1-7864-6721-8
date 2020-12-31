package com.example.kyle.criteriapattern;

/**
 * Created by kyle on 31/07/2016.
 */
public class Ingredient {
    String name;
    String local;
    boolean vegetarian;

    public Ingredient(String name, String local, boolean vegetarian){
        this.name = name;
        this.local = local;
        this.vegetarian = vegetarian;
    }

    public String getName() {
        return name;
    }

    public String getLocal() {
        return local;
    }

    public boolean isVegetarian(){
        return vegetarian;
    }
}
