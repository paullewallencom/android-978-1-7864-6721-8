package com.example.kyle.layoutbuilder.builder;

public abstract class Header implements LayoutView {

    @Override
    public Shading shading() {
        return new HeaderShading();
    }
}
