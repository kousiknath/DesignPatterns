package com.designpatterns.factory;

public class Main {

    public static void main(String[] args) {
        Transport transport1 = new RoadLogistics().getTransportMedium();
        transport1.deliverShipment();

        Transport transport2 = new SeaLogistics().getTransportMedium();
        transport2.deliverShipment();
    }
}
