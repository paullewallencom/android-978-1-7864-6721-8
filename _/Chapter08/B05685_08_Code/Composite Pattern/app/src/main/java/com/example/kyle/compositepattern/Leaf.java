package com.example.kyle.compositepattern;

import android.util.Log;

public class Leaf implements Component {
    private static final String DEBUG_TAG = "tag";
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void inflate() {
        Log.d(DEBUG_TAG, getName());
    }
}
