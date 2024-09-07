package com.designpatterns.command;

public class Main {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new CommandImpl(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.execute();
    }
}
