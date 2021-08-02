package edu.depaul.cdm.se450.patterns.decorator.he;

public class FrozenYogurt extends IceCream{
	public FrozenYogurt() {
        description = "FrozenYogurt IceCream";
    }

    public double cost() {
        cost = 2.50;
        return cost;
    }

}
