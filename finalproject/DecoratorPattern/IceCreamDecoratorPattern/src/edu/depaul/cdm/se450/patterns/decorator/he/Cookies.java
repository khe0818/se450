package edu.depaul.cdm.se450.patterns.decorator.he;

public class Cookies extends CondimentDecorator {
	IceCream ic;
	 public Cookies(IceCream ic) {
	        this.ic = ic;
	    }
	    @Override
	    public String getDescription() {
	        return ic.getDescription() + ", Cookies";
	    }

	    @Override
	    public double cost() {
	        return 1.50 + ic.cost();
	    }
}
