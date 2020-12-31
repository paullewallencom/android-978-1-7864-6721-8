package com.example.kyle.ordertracker;

public interface Subject {

    void register(Observer o);

    void unregister(Observer o);

    void notifyObserver();

    boolean getReady();

    void setReady(boolean b);
}
