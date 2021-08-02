package edu.depaul.cdm.se450.patterns.state.gumballstatewinner;

public class SoldState implements State {
    GumballMachine gumballMachine;

	//passed reference to GumballMachine
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
       
	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a gumball");
	}
 
	public void ejectQuarter() {
		System.out.println("Sorry, you already turned the crank");
	}
 
	public void turnCrank() {
		System.out.println("Turning twice doesn't get you another gumball!");
	}

	//will get called b/c customer paid, thus in sold state
	public void dispense() {
		gumballMachine.releaseBall();  //release gumball
		if (gumballMachine.getCount() > 0) { // check machine for gumballs left
		    //if we have gumballs, set state to NoQuarterState
			gumballMachine.setState(gumballMachine.getNoQuarterState());
			//else transition to soldOutState,since we have no more gumballs
		} else {
			System.out.println("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

	//not used in this state
	public void refill() { }
 
	public String toString() {
		return "dispensing a gumball";
	}
}
