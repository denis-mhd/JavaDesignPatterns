package design.patterns.behavioral.strategy.example.behavior.impl;

import design.patterns.behavioral.strategy.example.behavior.TravelBehavior;

public class AirTravelImpl implements TravelBehavior {
    @Override
    public void travel() {
        System.out.print(" is travelling by air");
    }
}
