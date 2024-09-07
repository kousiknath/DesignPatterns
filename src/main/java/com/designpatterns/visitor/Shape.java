package com.designpatterns.visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    void accept(Visitor visitor);
}
