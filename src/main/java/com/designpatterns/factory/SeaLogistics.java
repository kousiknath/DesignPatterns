package com.designpatterns.factory;

public class SeaLogistics implements Logistics {
    @Override
    public Transport getTransportMedium() {
        return new Ship();
    }

    @Override
    public int getCost() {
        return 0;
    }
}
