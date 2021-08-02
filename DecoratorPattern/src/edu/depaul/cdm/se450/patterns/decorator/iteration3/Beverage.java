package edu.depaul.cdm.se450.patterns.decorator.iteration3;

public abstract class Beverage {

    double cost = 0.0;

    //you should never see this
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
