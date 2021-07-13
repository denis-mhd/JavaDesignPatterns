package design.patterns.behavioral.command;

public class OnCommand implements Command{
    private Receiver receiver;

    public OnCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.on();
    }
}
