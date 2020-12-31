package com.example.kyle.layoutcomposer.components;

import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class CompositeShell implements Component {
    List<Component> components = new ArrayList<>();

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void setContent(int id) { }

    @Override
    public void inflate(ViewGroup layout) {

        for (Component component : components) {
            component.inflate(layout);
        }
    }
}
