package edu.depaul.cdm.se450.patterns.decorator.he;

public class Gelato extends IceCream{
	public Gelato() {
        description = "Gelato IceCream";
    }

    public double cost() {
        cost = 5.0;
        return cost;
    }

}
