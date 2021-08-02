package edu.depaul.cdm.se450.patterns.strategy.he;

public class NoStretch implements ClawAbility {

	@Override
	public void stretch() {
		System.out.println("my claw can't stretch");	
	}

}
