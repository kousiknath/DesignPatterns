package com.designpatterns.state;

public class StateA extends State{
    public StateA(Context ctx) {
        super(ctx);
    }

    @Override
    public void doA() {
        // do something here
        ctx.setState(new StateB(ctx)); // In state pattern, one State knows about other States
    }

    @Override
    public void doB() {
        // do nothing
    }

    @Override
    public void doC() {
        // do nothing
    }

    @Override
    public void doD() {
        // do nothing
    }
}
