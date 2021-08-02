package edu.depaul.cdm.se450.patterns.decorator.iteration2;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        super.getDescription();
        System.out.println("I'm a HouseBlend");
    }

    public double cost(){
        return super.cost() + 1.00;
    }

}
