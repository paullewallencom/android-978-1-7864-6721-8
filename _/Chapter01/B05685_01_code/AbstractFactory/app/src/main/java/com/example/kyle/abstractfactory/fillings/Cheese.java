package com.example.kyle.abstractfactory.fillings;

/**
 * Created by kyle on 26/07/2016.
 */
public class Cheese implements Filling {

    @Override
    public String name() {
        return "Cheese";
    }

    @Override
    public String calories() {
        return " : 155 kcal";
    }
}
