package edu.depaul.cdm.se450.patterns.decorator.he;

public class FriedIceCream extends IceCream{
	
	 public FriedIceCream() {
	        description = "Fried IceCream";
	    }

	    public double cost() {
	        cost = 3.50;
	        return cost;
	    }

}
