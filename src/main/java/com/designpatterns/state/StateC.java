package com.designpatterns.state;

public class StateC extends State {
    public StateC(Context ctx) {
        super(ctx);
    }

    @Override
    public void doA() {
        // do nothing
    }

    @Override
    public void doB() {
        // do nothing
    }

    @Override
    public void doC() {
        // do something
        ctx.setState(new StateD(ctx));
    }

    @Override
    public void doD() {
        // do nothing
    }
}
