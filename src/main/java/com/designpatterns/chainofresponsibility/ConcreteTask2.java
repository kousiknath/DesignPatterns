package com.designpatterns.chainofresponsibility;

public class ConcreteTask2 extends BaseTask {
    @Override
    public boolean canProcess() {
        return true;
    }

    @Override
    public void executeTask() {
        System.out.println("Executing task 2");
    }
}
