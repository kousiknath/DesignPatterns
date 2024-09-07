package com.designpatterns.chainofresponsibility;

public abstract class BaseTask implements Task {
    Task next;

    public BaseTask() {

    }

    public void setNext(Task nextTask) {
        this.next = nextTask;
    }

    @Override
    public void execute() {
        if (canProcess()) {
            executeTask();
        }
        if (next != null) {
            next.execute();
        }
    }

    public abstract boolean canProcess();

    public abstract void executeTask();
}
