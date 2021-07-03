package design.patterns.strategy.example;

import design.patterns.strategy.example.behavior.SpeedBehavior;
import design.patterns.strategy.example.behavior.TravelBehavior;

public class Ship extends Vehicle{
    public Ship(SpeedBehavior speedBehavior, TravelBehavior travelBehavior) {
        super(speedBehavior, travelBehavior);
    }
}
