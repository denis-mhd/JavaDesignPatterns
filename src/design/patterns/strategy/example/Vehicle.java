package design.patterns.strategy.example;

import design.patterns.strategy.example.behavior.SpeedBehavior;
import design.patterns.strategy.example.behavior.TravelBehavior;

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
