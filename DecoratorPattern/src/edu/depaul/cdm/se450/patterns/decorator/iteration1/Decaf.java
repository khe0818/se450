package edu.depaul.cdm.se450.patterns.decorator.iteration1;

public class Decaf extends Beverage {

    public Decaf() {
        super.setDescription("I'm a Decaf");
    }

    public double cost(){
        return .75;
    }

}
