package com.designpatterns.strategy;

public class PrivateCarStrategy implements TransportStrategy {
    @Override
    public void execute() {
        System.out.println("Private Car");
    }
}
