package edu.depaul.cdm.se450.patterns.strategy.strategy_3bad;

public class MallardDuck extends Duck implements Quackable, Flyable {

    public void display() {
        System.out.println("I'm a Mallard Duck");
    }

    //interface methods
    public void fly() {
        System.out.println("I'm flying");
    }

    public void quack() {
        System.out.println("I'm quacking");
    }
}
