package com.mew.kyle.checkoutvisitor;

public class SpecialOffer implements Item {
    private int baseCost;
    private int quantity;
    private String name;

    public SpecialOffer(int cost,
                        int quantity,
                        String name) {
        this.baseCost = cost;
        this.quantity = quantity;
        this.name = name;
    }

    public int getBaseCost() {
        return baseCost;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
