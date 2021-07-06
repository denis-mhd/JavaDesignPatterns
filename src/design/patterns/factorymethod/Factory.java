package design.patterns.factorymethod;


//The idea in Factory method design patterns goes more over automate creation of objects with something in common (that's why in this case
//concrete products are implementing Product interface).We just ask client (it could be user or api) to provide which concrete object he needs.
//And the rest is taking care from the implemented factory design pattern.
public class Factory {


    public Product produce(String product){
        Product result = null;
        switch (product) {
            case "A":
                result = new ConcreteProductA();
                break;
            case "B":
                result = new ConcreteProductB();
                break;
            default:
                System.out.println("No such product!");
        }
        return result;
    }

}
