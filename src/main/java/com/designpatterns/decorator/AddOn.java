package com.designpatterns.decorator;

public abstract class AddOn extends Beverage{
    protected Beverage beverage;

    public AddOn(String desc, Beverage beverage) {
        super(desc);
        this.beverage = beverage;
    }

    public abstract String getDescription();
}
