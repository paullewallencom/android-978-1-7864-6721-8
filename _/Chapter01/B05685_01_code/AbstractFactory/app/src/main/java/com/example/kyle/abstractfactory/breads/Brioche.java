package com.example.kyle.abstractfactory.breads;

/**
 * Created by kyle on 26/07/2016.
 */
public class Brioche implements Bread {

    @Override
    public String name() {
        return "Brioche";
    }

    @Override
    public String calories() {
        return " : 85 kcal";
    }
}
