package edu.depaul.cdm.se450.patterns.factories.nofactory;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore store = new PizzaStore();

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);

        pizza = store.orderPizza("pepperoni");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);

        pizza = store.orderPizza("greek");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);

    }
}

