package com.example.kyle.abstractfactory;

import com.example.kyle.abstractfactory.breads.Bread;
import com.example.kyle.abstractfactory.fillings.Cheese;
import com.example.kyle.abstractfactory.fillings.Filling;
import com.example.kyle.abstractfactory.fillings.Tomato;

/**
 * Created by kyle on 26/07/2016.
 */
public class FillingFactory extends AbstractFactory {

    @Override
    Filling getFilling(String filling) {

        if (filling == null) {
            return null;
        }

        if (filling == "CHE") {
            return new Cheese();

        } else if (filling == "TOM") {
            return new Tomato();
        }

        return null;
    }

    @Override
    Bread getBread(String bread) {
        return null;
    }
}
