package com.example.kyle.layoutbuilder.builder;

import com.example.kyle.layoutbuilder.R;


public class ContentShading implements Shading {

    @Override
    public int shade() {
        return R.color.text_secondary_dark;
    }

    @Override
    public int background() {
        return R.color.content_background;
    }
}
