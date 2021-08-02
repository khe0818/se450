package edu.depaul.cdm.se450.patterns.decorator.iteration3;

/*
Our condiments will be decorators that extend the condiment decorator class.
The decorator class extends the beverage class.
The super type of both the coffee drinks and the decorators is Beverage.
Thus beverages can be wrapped 0..* decorators.
So a latte IS A beverage that has Espresso (IS A Beverage) and has Milk.
 */

public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();

}
