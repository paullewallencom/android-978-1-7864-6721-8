package com.example.kyle.simplesandwich.decorations;

import com.example.kyle.simplesandwich.breads.Bread;
import com.example.kyle.simplesandwich.decorations.BreadDecorator;

/**
 * Created by kyle on 24/07/2016.
 */
public class Toasted extends BreadDecorator {
    private Bread bread;

    public Toasted(Bread bread) {
        this.bread = bread;
    }

    @Override
    public String getDecoration() {
        return "Toasted";
    }

    @Override
    public int getDecorationKcal() {
        return 0;
    }

    // Required but not used
    @Override
    public String description() {
        return null;
    }

    @Override
    public int kcal() {
        return 0;
    }
}
