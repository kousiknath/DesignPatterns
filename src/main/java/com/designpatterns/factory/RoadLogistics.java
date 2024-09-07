package com.designpatterns.factory;

public class RoadLogistics implements Logistics {
    @Override
    public Transport getTransportMedium() {
        return new Truck(); // Instead of creating the solid class instances in the code, we are hiding it behind a
        // creator / factory so that we can change the implementation without affecting the existing code
    }

    @Override
    public int getCost() {
        return 0;
    }
}
