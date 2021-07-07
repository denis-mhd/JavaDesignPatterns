package design.patterns.creational.abstractfactory.example;

public class LuxuryCar implements Car {
    @Override
    public void info() {
        System.out.println("Luxury car created!");
    }
}
