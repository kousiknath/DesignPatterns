package com.designpatterns.visitor;

public class Circle implements Shape {
    @Override
    public void move(int x, int y) {
        System.out.println("Moving a Circle");
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    public void accept(Visitor visitor) {
        System.out.println("Accept method of Circle called with visitor");
        visitor.addExtraNonPrimaryFeatureTo(this);
    }
}
