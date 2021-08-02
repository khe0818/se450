package edu.depaul.cdm.se450.patterns.factories.nofactory;

public class GreekPizza extends Pizza {
    public GreekPizza() {
        name = "Greek Pizza";
        dough = "Thin crust";
        sauce = "Red sauce";
        toppings.add("Spinach");
        toppings.add("Crumbled Feta cheese");
    }
}