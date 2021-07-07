package design.patterns.creational.factorymethod.example;

public class Small implements Car{
    @Override
    public void info() {
        System.out.println("Small car created!");
    }
}
