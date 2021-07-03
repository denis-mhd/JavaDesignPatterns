package design.patterns.strategy.example;

import design.patterns.strategy.example.behavior.SpeedBehavior;
import design.patterns.strategy.example.behavior.TravelBehavior;

public class AirPlane extends Vehicle{
    public AirPlane(SpeedBehavior speedBehavior, TravelBehavior travelBehavior) {
        super(speedBehavior, travelBehavior);
    }
}
