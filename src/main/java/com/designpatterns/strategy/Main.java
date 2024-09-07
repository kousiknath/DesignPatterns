package com.designpatterns.strategy;

public class Main {

    public static void main(String[] args) {
        TransportStrategy strategy = new WalkStrategy();
        Context context = new Context();
        context.setStrategy(strategy);
        context.doSomething();
    }
}
