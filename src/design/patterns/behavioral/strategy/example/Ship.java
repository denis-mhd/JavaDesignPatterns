package design.patterns.behavioral.strategy.example;

import design.patterns.behavioral.strategy.example.behavior.SpeedBehavior;
import design.patterns.behavioral.strategy.example.behavior.TravelBehavior;

public class Ship extends Vehicle{
    public Ship(SpeedBehavior speedBehavior, TravelBehavior travelBehavior) {
        super(speedBehavior, travelBehavior);
    }
}
