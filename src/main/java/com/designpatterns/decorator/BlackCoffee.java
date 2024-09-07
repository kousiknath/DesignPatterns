package com.designpatterns.decorator;

public class BlackCoffee extends Beverage{
    public BlackCoffee() {
        super("Black Coffee");
    }

    @Override
    public int cost() {
        return 100;
    }
}
