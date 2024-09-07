package com.designpatterns.visitor;

public class Main {

    public static void main(String[] args) {
        Visitor visitor = new ConcreteVisitor();
        Shape dot = new Dot();
        dot.accept(visitor);

        Shape circle = new Circle();
        circle.accept(visitor);

        Shape rectangle = new Rectangle();
        rectangle.accept(visitor);
    }
}
