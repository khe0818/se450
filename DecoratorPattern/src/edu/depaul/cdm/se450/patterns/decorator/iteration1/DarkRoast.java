package edu.depaul.cdm.se450.patterns.decorator.iteration1;

public class DarkRoast extends Beverage{

    public DarkRoast() {
        super.setDescription("I'm a DarkRoast");
    }

    public double cost(){
        return 1.0;
    }
}
