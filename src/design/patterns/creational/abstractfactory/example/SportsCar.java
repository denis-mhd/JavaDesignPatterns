package design.patterns.creational.abstractfactory.example;

public class SportsCar implements Car {
    @Override
    public void info() {
        System.out.println("Sports car created!");
    }
}
