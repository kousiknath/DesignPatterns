package com.designpatterns.command;

public class Invoker {
    // Invoker will have reference to multiple commands. For execute, rollback scenarios, invoker
    // will have multiple commands.
    Command command;

    public Invoker() {

    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute() {
        this.command.execute();
    }
}
