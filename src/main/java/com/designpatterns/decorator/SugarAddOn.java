package com.designpatterns.decorator;

public class SugarAddOn extends AddOn{
    public SugarAddOn(Beverage beverage) {
        super("Sugar", beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with Sugar";
    }

    @Override
    public int cost() {
        return beverage.cost() + 50;
    }
}
