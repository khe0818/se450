package edu.depaul.cdm.se450.patterns.decorator.iteration3;

import java.io.BufferedWriter;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Expresso";
    }
    
    public double cost() {
        return 1.99;
    }
}
