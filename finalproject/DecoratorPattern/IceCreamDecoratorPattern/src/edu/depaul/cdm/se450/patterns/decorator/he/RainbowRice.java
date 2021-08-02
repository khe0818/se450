package edu.depaul.cdm.se450.patterns.decorator.he;

public class RainbowRice extends CondimentDecorator{
	IceCream ic;
	 public RainbowRice(IceCream ic) {
	        this.ic = ic;
	    }
	    @Override
	    public String getDescription() {
	        return ic.getDescription() + ", RainBow Rice";
	    }

	    @Override
	    public double cost() {
	        return 1.10 + ic.cost();
	    }

}
