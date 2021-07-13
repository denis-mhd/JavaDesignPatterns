package design.patterns.behavioral.command.example.receiver;


import design.patterns.behavioral.command.Command;

public class TV extends BaseTVReceiver {

    @Override
    public void on() {
        System.out.println("The TV is ON!");
    }

    @Override
    public void off() {
        System.out.println("The TV is OFF!");
    }

    @Override
    public void up() {
        System.out.println("The TV volume is up!");
    }

    @Override
    public void down() {
        System.out.println("The TV volume is down!");
    }
}
