package edu.depaul.cdm.se450.patterns.strategy.strategy_4good;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I don't fly");
    }
}
