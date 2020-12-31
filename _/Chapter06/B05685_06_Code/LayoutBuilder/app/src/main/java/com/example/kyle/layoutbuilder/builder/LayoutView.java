package com.example.kyle.layoutbuilder.builder;

import android.view.ViewGroup;


public interface LayoutView {
    ViewGroup.LayoutParams layoutParams();

    int textSize();

    int content();

    Shading shading();

    int[] padding();
}
