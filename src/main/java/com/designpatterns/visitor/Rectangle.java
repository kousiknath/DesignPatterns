package com.designpatterns.visitor;

public class Rectangle implements Shape {
    @Override
    public void move(int x, int y) {
        System.out.println("Moving a rectangle");
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    public void accept(Visitor visitor) {
        System.out.println("Accept method of Rectangle called with visitor");
        visitor.addExtraNonPrimaryFeatureTo(this);
    }
}
