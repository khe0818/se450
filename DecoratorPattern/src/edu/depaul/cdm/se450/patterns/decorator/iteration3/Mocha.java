package edu.depaul.cdm.se450.patterns.decorator.iteration3;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        cost = 1.30 + beverage.cost();
        return cost;
    }
}
