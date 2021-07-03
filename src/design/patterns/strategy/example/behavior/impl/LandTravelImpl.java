package design.patterns.strategy.example.behavior.impl;

import design.patterns.strategy.example.behavior.TravelBehavior;

public class LandTravelImpl implements TravelBehavior {
    @Override
    public void travel() {
        System.out.print(" is travelling on land");
    }
}
