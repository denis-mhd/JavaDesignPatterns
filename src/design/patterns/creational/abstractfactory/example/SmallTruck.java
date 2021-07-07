package design.patterns.creational.abstractfactory.example;

public class SmallTruck implements Truck {
    @Override
    public void capacityInfo() {
        System.out.println("Small truck created! This truck loading capacity is 3.5 tons");
    }
}
