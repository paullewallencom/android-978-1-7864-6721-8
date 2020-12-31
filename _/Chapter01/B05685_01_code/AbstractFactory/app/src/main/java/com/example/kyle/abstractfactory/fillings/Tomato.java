package com.example.kyle.abstractfactory.fillings;

/**
 * Created by kyle on 26/07/2016.
 */
public class Tomato implements Filling {

    @Override
    public String name() {
        return "Tomato";
    }

    @Override
    public String calories() {
        return " : 15 kcal";
    }
}
