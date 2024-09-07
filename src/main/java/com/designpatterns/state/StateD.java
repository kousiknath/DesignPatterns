package com.designpatterns.state;

public class StateD extends State {
    public StateD(Context ctx) {
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
        // do nothing
    }

    @Override
    public void doD() {
        // do something
        // no state remaining to set here
    }
}
