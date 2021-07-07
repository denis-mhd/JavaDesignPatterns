package design.patterns.behavioral.strategy.example.behavior.impl;

import design.patterns.behavioral.strategy.example.behavior.SpeedBehavior;

public class SlowSpeedImpl implements SpeedBehavior {
    @Override
    public void speed() {
        System.out.println("very slow!");
    }
}
