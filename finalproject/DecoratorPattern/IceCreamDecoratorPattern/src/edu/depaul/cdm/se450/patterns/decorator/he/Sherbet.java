package edu.depaul.cdm.se450.patterns.decorator.he;

public class Sherbet extends IceCream{
	public Sherbet() {
        description = "Sherbet IceCream";
    }

    public double cost() {
        cost = 4.0;
        return cost;
    }

}
