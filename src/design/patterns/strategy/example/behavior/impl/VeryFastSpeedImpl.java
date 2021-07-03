package design.patterns.strategy.example.behavior.impl;

import design.patterns.strategy.example.behavior.SpeedBehavior;

public class VeryFastSpeedImpl implements SpeedBehavior {
    @Override
    public void speed() {
        System.out.println(" very fast!");
    }
}
