package design.patterns.behavioral.command;

//!!!SAME INTERFACES ARE USED FOR THE EXAMPLE!!!//
//Receiver could be every hardware thing that do the action. Light(TV, Laptop, Smartphone, Air conditioner,etc) which turning on or off.
public interface Receiver {

    void on();

    void off();
}
