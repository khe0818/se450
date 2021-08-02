package edu.depaul.cdm.se450.patterns.strategy.strategy_4good;

public class RegularQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("I quack");
    }
}
