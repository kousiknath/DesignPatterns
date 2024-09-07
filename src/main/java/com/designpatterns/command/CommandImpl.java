package com.designpatterns.command;

public class CommandImpl implements Command {
    // A command usually delegates the responsibility of the task to receivers.
    // The actual task is to be executed by the receivers.
    private Receiver receiver;

    public CommandImpl(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        // have different logic here to call the receivers
        this.receiver.doExecute();
    }
}
