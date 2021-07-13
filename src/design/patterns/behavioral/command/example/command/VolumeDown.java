package design.patterns.behavioral.command.example.command;

import design.patterns.behavioral.command.Command;
import design.patterns.behavioral.command.example.receiver.BaseTVReceiver;

public class VolumeDown implements Command {
    private BaseTVReceiver receiver;

    public VolumeDown(BaseTVReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.down();
    }
}
