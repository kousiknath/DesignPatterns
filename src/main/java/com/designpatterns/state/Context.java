package com.designpatterns.state;

public class Context {
    State state;

    public Context() {
        this.state = new StateA(this); // initialize with state A
    }

    public void setState(State state) {
        this.state = state;
    }

    public void doSomething() {
        this.state.doA();
    }

    public void helper1() {

    }

    public void helper2() {

    }
}
