package edu.depaul.cdm.se450.patterns.state.gumballstatewinner;

public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    //passed reference to GumballMachine
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    //accept quarter and change state
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
 
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there's no quarter");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 

	//inherited from interface, but not needed here
	public void refill() { }

	//if you in this state, it means you are waiting for a quarter
	public String toString() {
		return "waiting for quarter";
	}
}
