package edu.depaul.cdm.se450.patterns.decorator.iteration2;

public class Expresso extends Beverage {

    public Expresso() {
        super.getDescription();
        System.out.println("I'm a Expresso");
    }

    public double cost(){
        return super.cost() + 1.25;
    }
}
