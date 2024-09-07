package com.designpatterns.visitor;

public class ConcreteVisitor implements Visitor {
    @Override
    public void addExtraNonPrimaryFeatureTo(Dot dot) {
        System.out.println("Adding some non primary feature to Dot");
    }

    @Override
    public void addExtraNonPrimaryFeatureTo(Circle circle) {
        System.out.println("Adding some non primary feature to Circle");
    }

    @Override
    public void addExtraNonPrimaryFeatureTo(Rectangle rectangle) {
        System.out.println("Adding some non primary feature to Rectangle");
    }
}
