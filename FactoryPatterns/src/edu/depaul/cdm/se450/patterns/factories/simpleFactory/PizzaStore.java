package edu.depaul.cdm.se450.patterns.factories.simpleFactory;

public class PizzaStore {
    SimplePizzaFactory factory;

    /*
    by taking a factory, we could always decide
    to use another factory
    */
    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    //type specifies the kind of pizza we want
    public Pizza orderPizza(String type) {
        Pizza pizza;

        // below code works regardless of type of pizza
        System.out.println("Order in for " + type + " pizza...");
        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
