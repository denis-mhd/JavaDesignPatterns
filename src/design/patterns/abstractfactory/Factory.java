package design.patterns.abstractfactory;
//The Abstract Factory Pattern provides an Interface for creating families of related or dependent objects without specifying their
//concrete classes. It specify just the abstraction (like ProductA and ProductB interfaces)
//Abstract Factory pattern include factory method pattern, but it is extended to have more different factories all in union interface "Factory"
public interface Factory {
    ProductA getProductA();
    ProductB getProductB();
}
