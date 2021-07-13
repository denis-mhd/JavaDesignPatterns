package design.patterns.behavioral.command.example.command;

import design.patterns.behavioral.command.Command;
import design.patterns.behavioral.command.Receiver;

public class TurnOn implements Command {
    private Receiver receiver;

    public TurnOn(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.on();
    }
}
