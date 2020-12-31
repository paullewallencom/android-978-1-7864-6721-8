package com.example.kyle.factorypattern.breads;

/**
 * Created by kyle on 26/07/2016.
 */
public class Baguette implements Bread {

    @Override
    public String name() {
        return "Baguette";
    }

    @Override
    public String calories() {
        return " : 65 kcal";
    }
}
