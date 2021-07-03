package design.patterns.strategy.example;

import design.patterns.strategy.example.behavior.SpeedBehavior;
import design.patterns.strategy.example.behavior.TravelBehavior;

public class Car extends Vehicle{

    public Car(SpeedBehavior speedBehavior, TravelBehavior travelBehavior) {
        super(speedBehavior, travelBehavior);
    }


}
