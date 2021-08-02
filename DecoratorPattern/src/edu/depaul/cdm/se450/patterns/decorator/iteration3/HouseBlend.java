package edu.depaul.cdm.se450.patterns.decorator.iteration3;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return .99;
    }
}
