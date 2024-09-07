package com.designpatterns.abstractfactory;

public class TraditionalFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair getChair() {
        return new TraditionalChair();
    }

    @Override
    public Table getTable() {
        return new TraditionalTable();
    }
}
