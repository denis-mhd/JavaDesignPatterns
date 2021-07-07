package design.patterns.creational.factorymethod.example;

public class Luxury implements Car{
    @Override
    public void info() {
        System.out.println("Luxury car created!");
    }
}
