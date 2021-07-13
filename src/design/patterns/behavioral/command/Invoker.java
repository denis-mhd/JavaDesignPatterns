package design.patterns.behavioral.command;

//!!!SAME INTERFACES ARE USED FOR THE EXAMPLE!!!//
//We can look at Invoker as a Remote controller with many buttons and every button has different command we just press and magic happen.
public interface Invoker {
    void invoke(String command);
}
