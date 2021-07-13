package design.patterns.behavioral.command.example.invoker;

import design.patterns.behavioral.command.Command;
import design.patterns.behavioral.command.Invoker;

public class Alexa implements Invoker {
    private Command turnOn;
    private Command turnOff;
    private Command volumeUp;
    private Command volumeDown;

    public Alexa(Command turnOn, Command turnOff, Command volumeUp, Command volumeDown) {
        this.turnOn = turnOn;
        this.turnOff = turnOff;
        this.volumeUp = volumeUp;
        this.volumeDown = volumeDown;
    }

    @Override
    public void invoke(String command) {
        switch (command){
            case "On":
                this.turnOn.execute();
                break;
            case "Off":
                this.turnOff.execute();
                break;
            case "Up":
                this.volumeUp.execute();
                break;
            case "Down":
                this.volumeDown.execute();
                break;
            default:
                System.out.println("Command not supported!");
        }

    }
}
