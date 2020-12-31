package com.example.kyle.notifierexpanded;

public class Order implements Observer {
    private Subject subject = null;
    public Order(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String update() {

        if (subject.getReady()) {
            subject.unregister(this);
            return "Your order is ready to collect";

        } else {
            return "Your sandwich will be ready very soon";
        }
    }
}
