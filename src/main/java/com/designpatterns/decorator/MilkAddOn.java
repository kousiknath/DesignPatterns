package com.designpatterns.decorator;

public class MilkAddOn extends AddOn{
    public MilkAddOn(Beverage beverage) {
        super("Milk", beverage); // beverage will be automatically added to the `beverage` instance member through the abstract class
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " with Milk";
    }

    @Override
    public int cost() {
        return this.beverage.cost() + 100;
    }
}
