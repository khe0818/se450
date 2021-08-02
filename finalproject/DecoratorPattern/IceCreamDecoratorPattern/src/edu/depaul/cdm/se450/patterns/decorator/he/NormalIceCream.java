package edu.depaul.cdm.se450.patterns.decorator.he;

public class NormalIceCream extends IceCream {
	public NormalIceCream() {
        description = "Normal IceCream";
    }

    public double cost() {
        cost = 2.0;
        return cost;
    }
}
