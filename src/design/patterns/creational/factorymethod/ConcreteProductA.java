package design.patterns.creational.factorymethod;

public class ConcreteProductA implements Product{
    @Override
    public void info() {
        System.out.println("Concrete Product A created!");
    }
}
