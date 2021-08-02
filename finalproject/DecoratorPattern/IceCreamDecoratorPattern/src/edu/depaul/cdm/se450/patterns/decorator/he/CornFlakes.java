package edu.depaul.cdm.se450.patterns.decorator.he;

public class CornFlakes extends CondimentDecorator {
	IceCream ic;
	 public CornFlakes(IceCream ic) {
	        this.ic = ic;
	    }
	    @Override
	    public String getDescription() {
	        return ic.getDescription() + ", Corn Flakes";
	    }

	    @Override
	    public double cost() {
	        return 1.0 + ic.cost();
	    }
}
