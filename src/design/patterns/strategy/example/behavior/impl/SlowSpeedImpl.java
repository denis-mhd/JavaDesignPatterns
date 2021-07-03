package design.patterns.strategy.example.behavior.impl;

import design.patterns.strategy.example.behavior.SpeedBehavior;

public class SlowSpeedImpl implements SpeedBehavior {
    @Override
    public void speed() {
        System.out.println("very slow!");
    }
}
