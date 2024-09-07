package com.designpatterns.decorator;

public abstract class Beverage {
    private String description;

    public Beverage(String desc) {
        this.description = desc;
    }

    public String getDescription() {
        return this.description;
    }

    public abstract int cost();
}
