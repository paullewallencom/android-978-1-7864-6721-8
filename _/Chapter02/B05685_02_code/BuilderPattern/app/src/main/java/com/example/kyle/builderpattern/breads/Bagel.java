package com.example.kyle.builderpattern.breads;

/**
 * Created by kyle on 27/07/2016.
 */
public class Bagel extends Bread {

    @Override
    public String name() {
        return "Bagel";
    }

    @Override
    public int calories() {
        return 250;
    }
}
