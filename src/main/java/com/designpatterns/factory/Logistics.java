package com.designpatterns.factory;

// This is called Creator / factory
public interface Logistics {
    Transport getTransportMedium(); // create product
    int getCost();
}
