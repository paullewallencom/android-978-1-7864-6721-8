package com.example.kyle.abstractfactory;

/**
 * Created by kyle on 26/07/2016.
 */
public class FactoryGenerator {

    public static AbstractFactory getFactory(String factory) {

        if (factory == null) {
            return null;
        }

        if (factory == "BRE") {
            return new BreadFactory();
        } else if (factory == "FIL") {
            return new FillingFactory();
        }

        return null;
    }
}
