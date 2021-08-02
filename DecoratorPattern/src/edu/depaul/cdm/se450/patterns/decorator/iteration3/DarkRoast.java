package edu.depaul.cdm.se450.patterns.decorator.iteration3;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    public double cost() {
        cost = 1.10;
        return cost;
    }
}
