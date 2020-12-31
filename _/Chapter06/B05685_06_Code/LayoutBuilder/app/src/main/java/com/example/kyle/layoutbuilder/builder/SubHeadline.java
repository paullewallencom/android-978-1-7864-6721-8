package com.example.kyle.layoutbuilder.builder;

import android.view.ViewGroup;

import com.example.kyle.layoutbuilder.R;


public class SubHeadline extends Header {

    @Override
    public ViewGroup.LayoutParams layoutParams() {
        final int width = ViewGroup.LayoutParams.MATCH_PARENT;
        final int height = ViewGroup.LayoutParams.WRAP_CONTENT;

        return new ViewGroup.LayoutParams(width, height);
    }

    @Override
    public int textSize() {
        return 18;
    }

    @Override
    public int content() {
        return R.string.sub_head;
    }

    @Override
    public int[] padding() {
        return new int[]{32, 0, 16, 8};
    }
}
