package com.example.kyle.layoutbuilder.builder;

import android.view.ViewGroup;

import com.example.kyle.layoutbuilder.R;


public class SimpleContent extends Content {

    @Override
    public ViewGroup.LayoutParams layoutParams() {
        final int width = ViewGroup.LayoutParams.MATCH_PARENT;
        final int height = ViewGroup.LayoutParams.WRAP_CONTENT;

        return new ViewGroup.LayoutParams(width, height);
    }

    @Override
    public int textSize() {
        return 14;
    }

    @Override
    public int content() {
        return R.string.short_text;
    }

    @Override
    public int[] padding() {
        return new int[]{16, 18, 16, 16};
    }
}
