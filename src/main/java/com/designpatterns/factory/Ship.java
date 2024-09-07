package com.designpatterns.factory;

// `Ship` is a product
public class Ship implements Transport {
    @Override
    public void deliverShipment() {
        System.out.println("Sea shipment by ship");
    }
}
