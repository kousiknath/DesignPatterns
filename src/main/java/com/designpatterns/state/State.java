package com.designpatterns.state;

/*
    In State design pattern, one State knows about other States.
    But in Strategy, the helper objects are completely independent of each other.
 */
public abstract class State {
    protected Context ctx;

    public State(Context context) {
        this.ctx = context;
    }

    public abstract void doA();
    public abstract void doB();
    public abstract void doC();
    public abstract void doD();
}
