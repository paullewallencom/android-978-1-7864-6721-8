package com.example.kyle.simplesandwich.decorations;

import com.example.kyle.simplesandwich.breads.Bread;

/**
 * Created by kyle on 24/07/2016.
 */
public abstract class BreadDecorator extends Bread {

    public abstract String getDecoration();

    public abstract int getDecorationKcal();
}
