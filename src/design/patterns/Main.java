package design.patterns;


import design.patterns.creational.abstractfactory.example.CarFactory;
import design.patterns.creational.abstractfactory.example.TruckFactory;
import design.patterns.creational.builder.example.BankAccount;
import design.patterns.creational.factorymethod.Factory;
import design.patterns.creational.prototype.Sheep;
import design.patterns.creational.singleton.example.PrinterExample;
import design.patterns.behavioral.strategy.example.AirPlane;
import design.patterns.behavioral.strategy.example.Car;
import design.patterns.behavioral.strategy.example.Ship;
import design.patterns.behavioral.strategy.example.Vehicle;
import design.patterns.behavioral.strategy.example.behavior.impl.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String command = bufferedReader.readLine();

        switch (command){
            case "Singleton":
                //getMyPrinter() will print on console the hardcoded printer brand, model and the hashcode
                PrinterExample.getMyPrinter();
                PrinterExample.print("I am your Printer!");
                //calling getMyPrinter() will check if we calling same instance of MyPrinter
                PrinterExample.getMyPrinter();
                break;

            case "Builder":
                BankAccount bankAccount = new BankAccount.Builder()
                        .accountNumber(1234L)
                        .withOwner("Uncle Scrooge")
                        .atBranch("Somewhere")
                        .openingBalance(100000000)
                        .atRate(2)
                        .build();
                break;

            case "Strategy":
                SlowSpeedImpl slow = new SlowSpeedImpl();
                SeaTravelImpl sea = new SeaTravelImpl();
                FastSpeedImpl fast = new FastSpeedImpl();
                LandTravelImpl land = new LandTravelImpl();
                VeryFastSpeedImpl veryFast = new VeryFastSpeedImpl();
                AirTravelImpl air = new AirTravelImpl();
                Vehicle ship = new Ship(slow, sea);
                Vehicle car = new Car(fast, land);
                Vehicle airPlane = new AirPlane(veryFast, air);
                getVehicleInfo(ship);
                getVehicleInfo(car);
                getVehicleInfo(airPlane);
                break;

            case "Factory":
                Factory factory = new Factory();
                factory.produce("Luxury").info();
                factory.produce("Sports").info();
                factory.produce("Small").info();
                break;

            case "Abstract Factory":
                TruckFactory truckFactory = new TruckFactory();
                truckFactory.produce("Big").capacityInfo();
                truckFactory.produce("Small").capacityInfo();
                CarFactory carFactory = new CarFactory();
                carFactory.produce("Luxury").info();
                carFactory.produce("Sports").info();
                carFactory.produce("Small").info();
                break;

            case "Prototype":
                Sheep sheep = new Sheep();
                sheep.setName("Dolly");
                sheep.setColor("white");
                Sheep dolly = null;
                try {
                    dolly = sheep.clone();
                } catch (CloneNotSupportedException e) {
                    e.printStackTrace();
                }
                System.out.println(sheep.getName() + sheep.getColor());
                System.out.println(dolly.getName() + dolly.getColor());
        }

    }
    public static void getVehicleInfo(Vehicle vehicle){
        //Getting vehicle name using reflection (this is not part of Strategy design pattern)
        //It is just to make it more interesting
        System.out.print(vehicle.getClass().getSimpleName());
        vehicle.getTravelBehavior().travel();
        vehicle.getSpeedBehavior().speed();


    }
}
