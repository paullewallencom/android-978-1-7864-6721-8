package com.example.kyle.builderpattern.fillings;

import com.example.kyle.builderpattern.fillings.Filling;

/**
 * Created by kyle on 27/07/2016.
 */
public class SmokedSalmon extends Filling {

    @Override
    public String name() {
        return "Smoked salmon";
    }

    @Override
    public int calories() {
        return 400;
    }
}
