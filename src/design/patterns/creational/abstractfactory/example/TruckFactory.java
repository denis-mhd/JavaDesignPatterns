package design.patterns.creational.abstractfactory.example;

public class TruckFactory implements Factory{
    @Override
    public Truck produce(String type) {
        Truck truck = null;
        switch (type){
            case "Big":
                truck = new BigTruck();
                break;
            case "Small":
                truck = new SmallTruck();
                break;
            default:
                System.out.println("No such truck!");
        }
        return truck;
    }
}
