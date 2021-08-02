package edu.depaul.cdm.se450.patterns.decorator.iteration3;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        cost = .10 + beverage.cost();
        return cost;
    }
}
