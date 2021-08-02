package edu.depaul.cdm.se450.patterns.factories.factorymethod;

/*
PizzaStore now becomes and abstract class.  That way, Chicago
stores and NewYork stores will have to extend this. This makes
sure that all stores use the same algorithm to prepare a pizza.
*/
public abstract class PizzaStore {

    /*
    by making this method abstract, we allow each type of store..
    NY or Chicago type, to define how to create their pizza.
    Therefore it defers instantiation to subclasses.
    */
    abstract Pizza createPizza(String item);

    //inherited by all the pizza stores
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
