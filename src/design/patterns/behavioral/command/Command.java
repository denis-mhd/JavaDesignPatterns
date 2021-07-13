package design.patterns.behavioral.command;

//!!!SAME INTERFACES ARE USED FOR THE EXAMPLE!!!//
//The Command pattern is used to create objects that represents actions. We implements Command Interface on every concrete command.
//With command pattern we hide the implementation of every command from the clients.
public interface Command {
    void execute();
}
