package edu.depaul.cdm.se450.patterns.strategy.strategy_2bad;

public class DecoyDuck extends Duck{

    @Override
    public void display() {
        System.out.println("I'm a Decoy Duck");
    }

    @Override
    public void quack() {
        System.out.println("I don't quack..I sqeak!");
    }

    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
