package design.patterns.abstractfactory.example;

public class SmallCar implements Car {
    @Override
    public void info() {
        System.out.println("Small car created!");
    }
}
