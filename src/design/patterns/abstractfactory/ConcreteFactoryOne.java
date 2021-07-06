package design.patterns.abstractfactory;

//You can have different factories for different kind of products
public class ConcreteFactoryOne implements Factory {


    @Override
    public ProductA getProductA() {
        ProductA productA = new ConcreteProductAOne();
        return productA;
    }

    @Override
    public ProductB getProductB() {
        ProductB productB = new ConcreteProductBOne();
        return productB;
    }
}
