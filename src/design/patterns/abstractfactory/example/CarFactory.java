package design.patterns.abstractfactory.example;

public class CarFactory implements Factory {

    @Override
    public Car produce(String type) {
        Car car = null;
        switch (type){
            case "Luxury":
                car = new LuxuryCar();
                break;
            case "Sports":
                car = new SportsCar();
                break;
            case "Small":
                car = new SmallCar();
                break;
            default:
                System.out.println("No such car!");
        }
        return car;
    }
}
