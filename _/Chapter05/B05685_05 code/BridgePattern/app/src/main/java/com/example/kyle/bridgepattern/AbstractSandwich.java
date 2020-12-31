package com.example.kyle.bridgepattern;

/**
 * Created by kyle on 30/07/2016.
 */
public abstract class AbstractSandwich {
    protected SandwichInterface sandwichInterface;

    protected AbstractSandwich(SandwichInterface sandwichInterface) {
        this.sandwichInterface = sandwichInterface;
    }

    public abstract void make();
}
