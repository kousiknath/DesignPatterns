package com.designpatterns.strategy;

public class Context {
    private TransportStrategy strategy;

    public Context() {

    }

    public void setStrategy(TransportStrategy strategy) {
        this.strategy = strategy;
    }

    public void doSomething() {
        if (this.strategy != null) {
            this.strategy.execute();
        }
    }
}
