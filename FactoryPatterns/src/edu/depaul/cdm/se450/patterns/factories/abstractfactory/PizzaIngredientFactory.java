package edu.depaul.cdm.se450.patterns.factories.abstractfactory;

public interface PizzaIngredientFactory {

	//factory will create dough, sauce, cheese
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
