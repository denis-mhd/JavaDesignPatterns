package design.patterns.creational.factorymethod;

public class ConcreteProductB implements Product{
    @Override
    public void info() {
        System.out.println("Concrete Product B created!");
    }
}
