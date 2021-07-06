package design.patterns.abstractfactory.example;

public class LuxuryCar implements Car {
    @Override
    public void info() {
        System.out.println("Luxury car created!");
    }
}
