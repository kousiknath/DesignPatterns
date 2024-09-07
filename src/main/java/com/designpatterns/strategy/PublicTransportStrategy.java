package com.designpatterns.strategy;

public class PublicTransportStrategy implements TransportStrategy {
    @Override
    public void execute() {
        System.out.println("Road transport strategy");
    }
}
