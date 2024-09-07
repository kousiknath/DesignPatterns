package com.designpatterns.state;

public class StateB extends State {

    public StateB(Context ctx) {
        super(ctx);
    }

    @Override
    public void doA() {
        // do nothing
    }

    @Override
    public void doB() {
        // do something
        ctx.setState(new StateC(ctx));
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
