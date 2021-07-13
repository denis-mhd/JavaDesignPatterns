package design.patterns.behavioral.command.example.command;

import design.patterns.behavioral.command.Command;
import design.patterns.behavioral.command.Receiver;

public class TurnOff implements Command {
    private Receiver receiver;

    public TurnOff(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.off();
    }
}
