package com.example.kyle.utilitytracker;

import java.util.Observable;

public class Sandwich extends Observable {
    private boolean ready;

    public Sandwich(boolean ready) {
        this.ready = ready;
    }

    public boolean getReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
        setChanged();
        notifyObservers();
    }
}
