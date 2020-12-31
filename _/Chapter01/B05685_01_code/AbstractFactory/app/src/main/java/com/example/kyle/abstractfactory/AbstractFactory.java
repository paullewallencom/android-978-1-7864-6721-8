package com.example.kyle.abstractfactory;

import com.example.kyle.abstractfactory.breads.Bread;
import com.example.kyle.abstractfactory.fillings.Filling;

/**
 * Created by kyle on 26/07/2016.
 */
public abstract class AbstractFactory {

    abstract Bread getBread(String bread);

    abstract Filling getFilling(String filling);
}
