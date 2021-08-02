package edu.depaul.cdm.se450.patterns.decorator.he;

public class Fruits extends CondimentDecorator{
	IceCream ic;
	 public Fruits(IceCream ic) {
	        this.ic = ic;
	    }
	    @Override
	    public String getDescription() {
	        return ic.getDescription() + ", Fruits";
	    }

	    @Override
	    public double cost() {
	        return 2.00 + ic.cost();
	    }
}
