package design.patterns.behavioral.command.example.receiver;

import design.patterns.behavioral.command.Command;
import design.patterns.behavioral.command.Receiver;

public abstract class BaseTVReceiver implements Receiver {

    public abstract void up();

    public abstract void down();
}
