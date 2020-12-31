package com.example.kyle.compositepattern;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private static final String DEBUG_TAG = "tag";

    // Store components
    List<Component> components = new ArrayList<>();
    private String name;

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void inflate() {
        Log.d(DEBUG_TAG, getName());

        // Inflate composites including children
        for (Component component : components) {
            component.inflate();
        }
    }
}

