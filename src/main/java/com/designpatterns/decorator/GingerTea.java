package com.designpatterns.decorator;

public class GingerTea extends Beverage{
    public GingerTea() {
        super("Ginger Tea");
    }

    @Override
    public int cost() {
        return 30; // INR 30
    }
}
