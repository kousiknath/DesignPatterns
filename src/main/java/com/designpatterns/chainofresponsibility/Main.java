package com.designpatterns.chainofresponsibility;

public class Main {

    public static void main(String[] args) {
        BaseTask task1 = new ConcreteTask1();
        BaseTask task2 = new ConcreteTask2();
        task1.setNext(task2);

        task1.execute();
    }
}
