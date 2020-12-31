package com.example.kyle.factorypattern.breads;

/**
 * Created by kyle on 26/07/2016.
 */
public class Roll implements Bread {

    @Override
    public String name() {
        return "Roll";
    }

    @Override
    public String calories() {
        return " : 75 kcal";
    }
}
