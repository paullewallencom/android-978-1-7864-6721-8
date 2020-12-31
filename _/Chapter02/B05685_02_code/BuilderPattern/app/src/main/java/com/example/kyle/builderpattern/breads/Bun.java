package com.example.kyle.builderpattern.breads;

/**
 * Created by kyle on 27/07/2016.
 */
public class Bun extends Bread {

    @Override
    public String name() {
        return "Bun";
    }

    @Override
    public int calories() {
        return 150;
    }
}
