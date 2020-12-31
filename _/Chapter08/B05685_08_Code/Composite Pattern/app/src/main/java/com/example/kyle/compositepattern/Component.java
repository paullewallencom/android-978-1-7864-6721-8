package com.example.kyle.compositepattern;

public interface Component {

    void add(Component component);
    String getName();
    void inflate();
}
