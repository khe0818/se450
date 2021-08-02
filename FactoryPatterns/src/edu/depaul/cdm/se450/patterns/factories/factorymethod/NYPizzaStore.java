package edu.depaul.cdm.se450.patterns.factories.factorymethod;

//This class is for NY PizzaStores to make NY Style pizza
public class NYPizzaStore extends PizzaStore {


	Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else return null;
	}
}
