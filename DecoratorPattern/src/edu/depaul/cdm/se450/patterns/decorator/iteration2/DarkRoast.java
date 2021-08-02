package edu.depaul.cdm.se450.patterns.decorator.iteration2;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        super.getDescription();
        System.out.println("I'm a DarkRoast");
    }

    public double cost(){
        return super.cost() + 1;
    }
}
