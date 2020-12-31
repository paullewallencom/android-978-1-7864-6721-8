package com.example.kyle.layoutbuilder.builder;

import com.example.kyle.layoutbuilder.R;


public class HeaderShading implements Shading {

    @Override
    public int shade() {
        return R.color.text_primary_dark;
    }

    @Override
    public int background() {
        return R.color.title_background;
    }
}
