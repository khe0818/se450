package edu.depaul.cdm.se450.patterns.decorator.iteration1;

public class Espresso extends Beverage {

    public Espresso() {
        super.setDescription("I'm a Espresso");
    }

    public double cost(){
        return 1.25;
    }
}
