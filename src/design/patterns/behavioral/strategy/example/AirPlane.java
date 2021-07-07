package design.patterns.behavioral.strategy.example;

import design.patterns.behavioral.strategy.example.behavior.SpeedBehavior;
import design.patterns.behavioral.strategy.example.behavior.TravelBehavior;

public class AirPlane extends Vehicle{
    public AirPlane(SpeedBehavior speedBehavior, TravelBehavior travelBehavior) {
        super(speedBehavior, travelBehavior);
    }
}
