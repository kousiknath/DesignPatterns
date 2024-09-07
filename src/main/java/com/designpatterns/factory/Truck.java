package com.designpatterns.factory;

// `Truck` is a product
public class Truck implements Transport {
    @Override
    public void deliverShipment() {
        System.out.println("Road delivery by truck");
    }
}
