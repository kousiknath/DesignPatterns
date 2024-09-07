package com.designpatterns.abstractfactory;

public class Main {

    public static void main(String[] args) {
        Table traditionalTable = new TraditionalFurnitureFactory().getTable();
        System.out.println(traditionalTable.myType());

        Chair traditionalChair = new TraditionalFurnitureFactory().getChair();
        System.out.println(traditionalChair.myType());

        Table modernTable = new ModernFurnitureFactory().getTable();
        System.out.println(modernTable.myType());

        Chair modernChair = new ModernFurnitureFactory().getChair();
        System.out.println(modernChair.myType());
    }
}
