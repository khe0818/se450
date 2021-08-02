package edu.depaul.cdm.se450.patterns.strategy.strategy_3bad;

public class DecoyDuck extends Duck implements Quackable, Flyable {

    public void display() {
        System.out.println("I'm a Decoy Duck");
    }

    //interface methods
    public void quack() {
        System.out.println("I don't quack!");
    }

    public void fly() {
        System.out.println("I can't fly!");
    }
}
