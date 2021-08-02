package edu.depaul.cdm.se450.patterns.decorator.iteration1;

public abstract class Beverage {

    public String description;

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
