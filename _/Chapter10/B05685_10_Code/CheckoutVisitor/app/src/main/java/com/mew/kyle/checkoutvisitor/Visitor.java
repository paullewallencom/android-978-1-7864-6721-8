package com.mew.kyle.checkoutvisitor;

public interface Visitor {

    int visit(FreshFood freshFood);
    int visit(CannedFood cannedFood);

    int visit(SpecialOffer specialOffer);
}
