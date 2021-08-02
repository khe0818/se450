package edu.depaul.cdm.se450.patterns.strategy.strategy_4good;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Mute quack");
    }
}
