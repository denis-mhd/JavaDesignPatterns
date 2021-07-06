package design.patterns.abstractfactory.example;

public class BigTruck implements Truck{
    @Override
    public void capacityInfo() {
        System.out.println("Big Truck created! This truck loading capacity is 20 tons");
    }
}
