package design.patterns.creational.factorymethod.example;

public class CarFactory {

    public Car produce(String type){
        Car car = null;
        switch (type){
            case "Luxury":
                car = new Luxury();
                break;
            case "Sports":
                car = new Sports();
                break;
            case "Small":
                car = new Small();
                break;
            default:
                System.out.println("No such car!");
        }
        return car;
    }
}
