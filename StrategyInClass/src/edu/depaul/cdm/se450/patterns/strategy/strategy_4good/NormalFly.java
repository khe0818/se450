package edu.depaul.cdm.se450.patterns.strategy.strategy_4good;

public class NormalFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I fly normally");
    }
}
