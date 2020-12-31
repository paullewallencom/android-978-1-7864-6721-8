package com.example.kyle.factorypattern;

import com.example.kyle.factorypattern.breads.Baguette;
import com.example.kyle.factorypattern.breads.Bread;
import com.example.kyle.factorypattern.breads.Brioche;
import com.example.kyle.factorypattern.breads.Roll;

/**
 * Created by kyle on 26/07/2016.
 */
public class BreadFactory {

    public Bread getBread(String breadType) {

        if (breadType == null) {
            return null;
        }

        if (breadType == "BRI") {
            return new Brioche();

        } else if (breadType == "BAG") {
            return new Baguette();

        } else if (breadType == "ROL") {
            return new Roll();
        }

        return null;
    }
}
