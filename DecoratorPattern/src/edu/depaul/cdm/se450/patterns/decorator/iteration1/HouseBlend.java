package edu.depaul.cdm.se450.patterns.decorator.iteration1;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        super.setDescription("I'm a HouseBlend");
    }

    public double cost(){
        return 1.00;
    }

}
