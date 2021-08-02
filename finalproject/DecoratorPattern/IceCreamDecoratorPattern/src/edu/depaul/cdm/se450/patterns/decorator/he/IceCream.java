package edu.depaul.cdm.se450.patterns.decorator.he;

public abstract class IceCream {
	double cost = 0.0;
	String description = "this type of ice cream is not provided in our store";
	public String getDescription() {
		return description;
	}
	public abstract double cost();
}
