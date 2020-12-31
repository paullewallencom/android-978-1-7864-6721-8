package com.example.kyle.strategypattern.strategies;


public class Coupon implements Strategy{

    @Override
    public String processPayment(float price) {

        return String.format("%.2f", price * 0.9f);
    }
}
