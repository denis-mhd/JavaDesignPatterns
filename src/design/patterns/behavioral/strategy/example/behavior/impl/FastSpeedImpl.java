package design.patterns.behavioral.strategy.example.behavior.impl;

import design.patterns.behavioral.strategy.example.behavior.SpeedBehavior;

public class FastSpeedImpl implements SpeedBehavior {
    @Override
    public void speed() {
        System.out.println(" fast!");
    }
}
