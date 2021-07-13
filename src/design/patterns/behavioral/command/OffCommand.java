package design.patterns.behavioral.command;

public class OffCommand implements Command{
    private Receiver receiver;

    public OffCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.off();
    }

}
