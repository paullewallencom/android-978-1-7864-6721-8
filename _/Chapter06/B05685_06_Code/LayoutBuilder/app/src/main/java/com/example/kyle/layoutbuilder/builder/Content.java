package com.example.kyle.layoutbuilder.builder;

public abstract class Content implements LayoutView {

    @Override
    public Shading shading() {
        return new ContentShading();
    }
}
