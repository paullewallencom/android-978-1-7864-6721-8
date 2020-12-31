package com.example.kyle.utilitytracker;

import java.util.Observable;
import java.util.Observer;

public class Order implements Observer {
    private String update;

    public String getUpdate() {
        return update;
    }

    @Override
    public void update(Observable observable, Object o) {
        Sandwich subject = (Sandwich) observable;

        if (subject.getReady()) {
            subject.deleteObserver(this);
            update = "Your order is ready to collect";

        } else {
            update = "Your sandwich will be ready very soon";
        }
    }
}
