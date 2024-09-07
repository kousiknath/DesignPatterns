package com.designpatterns.visitor;

public class Dot implements Shape {
    @Override
    public void move(int x, int y) {
        System.out.println("Moving a Dot");
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Dot");
    }

    // This method essentially adds some new code to the existing code probably violating
    // Open-Closed principle. But this is a very minor non-harmful change
    @Override
    public void accept(Visitor visitor) {
        System.out.println("Accept method of Dot called with visitor");
        visitor.addExtraNonPrimaryFeatureTo(this);
    }
}
