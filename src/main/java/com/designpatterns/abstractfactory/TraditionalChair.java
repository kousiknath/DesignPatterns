package com.designpatterns.abstractfactory;

public class TraditionalChair implements Chair {
    @Override
    public void sitOnLegs() {

    }

    @Override
    public String myType() {
        return "TraditionalChair";
    }
}
