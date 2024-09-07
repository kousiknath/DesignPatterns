package com.designpatterns.abstractfactory;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair getChair() {
        return new ModernChair();
    }

    @Override
    public Table getTable() {
        return new ModernTable();
    }
}
