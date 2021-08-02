package edu.depaul.cdm.se450.patterns.strategy.he;

public class NoRoar implements RoarBehavior {

	@Override
	public void roar() {
		System.out.println("i'm not roaring, just purring");		
	}

}
