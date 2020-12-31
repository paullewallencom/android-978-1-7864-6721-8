package com.example.kyle.strategypattern;

import com.example.kyle.strategypattern.strategies.Strategy;


public class Payment {
    private Strategy strategy;

    public Payment(Strategy strategy) {
        this.strategy = strategy;
    }

    public String employStrategy(float f) {
        return strategy.processPayment(f);
    }
}
