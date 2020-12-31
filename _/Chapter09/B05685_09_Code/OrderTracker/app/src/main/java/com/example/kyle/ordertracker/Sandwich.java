package com.example.kyle.ordertracker;

import java.util.ArrayList;

public class Sandwich implements Subject {
    public boolean ready;
    private ArrayList<Observer> orders = new ArrayList<Observer>();

    @Override
    public void register(Observer o) {
        orders.add(o);
    }

    @Override
    public void unregister(Observer o) {
        orders.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer order : orders) {
            order.update();
        }
    }

    @Override
    public boolean getReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
       // notifyObserver();
    }
}
