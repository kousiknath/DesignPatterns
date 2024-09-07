package com.designpatterns.strategy;

public class WalkStrategy implements TransportStrategy{
    @Override
    public void execute() {
        System.out.println("Walking");
    }
}
