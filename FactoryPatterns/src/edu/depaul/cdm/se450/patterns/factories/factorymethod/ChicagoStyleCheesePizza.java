package edu.depaul.cdm.se450.patterns.factories.factorymethod;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() { 
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Shredded Mozzarella Cheese");
	}

	//override diagonal cut()
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
