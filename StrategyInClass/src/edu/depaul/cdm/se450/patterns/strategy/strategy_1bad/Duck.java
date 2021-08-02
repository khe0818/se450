package edu.depaul.cdm.se450.patterns.strategy.strategy_1bad;

public abstract class Duck {

    public void swim(){
        System.out.println("I'm swimming");
    }

    public void quack(){
        System.out.println("I'm quacking!");
    }

    public void fly(){
        System.out.println("I'm flying!");
    }

    //All ducks must provide implementation for this method
    public abstract void display();

}