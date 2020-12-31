package com.example.kyle.builderpattern.fillings;

/**
 * Created by kyle on 27/07/2016.
 */
public class CreamCheese extends Filling {

    @Override
    public String name() {
        return "Cream cheese";
    }

    @Override
    public int calories() {
        return 350;
    }
}
