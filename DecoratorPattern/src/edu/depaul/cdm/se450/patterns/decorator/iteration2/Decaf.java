package edu.depaul.cdm.se450.patterns.decorator.iteration2;

public class Decaf extends Beverage {

    public Decaf() {
        super.getDescription();
        System.out.println("I'm a Decaf");
    }

    public double cost(){
        return super.cost() + .75;
    }

}
