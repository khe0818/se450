package edu.depaul.cdm.se450.patterns.factories.factorymethod;

public class NYStyleCheesePizza extends Pizza {

	//everything done in the constructor
	public NYStyleCheesePizza() { 
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
 
		toppings.add("Grated Reggiano Cheese");
	}
}
