package edu.depaul.cdm.se450.patterns.factories.nofactory;

public class PizzaStore {

    public Pizza orderPizza(String type){

        Pizza pizza = null;

        System.out.println("Order in for " + type + " pizza...");

        /*
        we create the pizza here based on the type passed in
        runtime decision on class instantiation,
        but what happens when we need to add different kinds of pizza?
        --> then, we'll need to change this code...not good
        */
        if(type.equals("cheese")){
            pizza = new CheesePizza();
        }else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }else if (type.equals("greek")){
            pizza = new GreekPizza();
        }

        //things we do to all pizzas
        if(pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
        return pizza;
    }
}
