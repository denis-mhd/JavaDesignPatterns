package design.patterns.behavioral.strategy.example;

import design.patterns.behavioral.strategy.example.behavior.SpeedBehavior;
import design.patterns.behavioral.strategy.example.behavior.TravelBehavior;

public class Vehicle {
    private final SpeedBehavior speedBehavior;
    private final TravelBehavior travelBehavior;

    public Vehicle(SpeedBehavior speedBehavior, TravelBehavior travelBehavior) {
        this.speedBehavior = speedBehavior;
        this.travelBehavior = travelBehavior;
    }

    public SpeedBehavior getSpeedBehavior() {
        return speedBehavior;
    }

    public TravelBehavior getTravelBehavior() {
        return travelBehavior;
    }


}
