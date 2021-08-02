package edu.depaul.cdm.se450.patterns.state.gumballstatewinner;

public interface State {
 
	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();

	public default void sayHi(){
		System.out.println("Hi");
	}
	
	public void refill();
}
