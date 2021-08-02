package edu.depaul.cdm.se450.patterns.state.gumball;

public class GumballMachine {

	//Four states (see State Diagram in HFDP)
	final static int SOLD_OUT = 0;
	final static int NO_QUARTER = 1;
	final static int HAS_QUARTER = 2;
	final static int SOLD = 3;

	//state tracks the current sate
    //initialized to sold out state.
	int state = SOLD_OUT;
	//tracks the number of gumballs
	int countOfGumballs = 0;

	//takes in the count of gumballs.
	public GumballMachine(int countOfGumballs) {
		this.countOfGumballs = countOfGumballs;
		if (countOfGumballs > 0) {
			state = NO_QUARTER;
		}
	}
  
	public void insertQuarter() {
		if (state == HAS_QUARTER) {
			System.out.println("You can't insert another quarter");
		} else if (state == NO_QUARTER) {
			state = HAS_QUARTER;  //changes state
			System.out.println("You inserted a quarter");
		} else if (state == SOLD_OUT) {
			System.out.println("You can't insert a quarter, the machine is sold out");
		} else if (state == SOLD) {
        	System.out.println("Please wait, we're already giving you a gumball");
		}
	}

	public void ejectQuarter() {
		if (state == HAS_QUARTER) {
			System.out.println("Quarter returned");
			state = NO_QUARTER;  //state changes
		//none below will eject quarter, but will give user message
        //based on the current state.
		} else if (state == NO_QUARTER) {
			System.out.println("You haven't inserted a quarter");
		} else if (state == SOLD) {
			System.out.println("Sorry, you already turned the crank");
		} else if (state == SOLD_OUT) {
        	System.out.println("You can't eject, you haven't inserted a quarter yet");
		}
	}

	//attempt to turn the crank
	public void turnCrank() {
		if (state == SOLD) {
			System.out.println("Turning twice doesn't get you another gumball!");
		} else if (state == NO_QUARTER) {
			System.out.println("You turned but there's no quarter");
		} else if (state == SOLD_OUT) {
			System.out.println("You turned, but there are no gumballs");
		// only state that allows crank to turn
		} else if (state == HAS_QUARTER) {
			System.out.println("You turned...");
			state = SOLD;  //state changes, user can no longer turn crank see line 55
			dispense();
		}
	}

	//dispenses gumball
	private void dispense() {
		if (state == SOLD) {
            //dispensing of gumball
			System.out.println("A gumball comes rolling out the slot");
			//decrement gumball count
			countOfGumballs = countOfGumballs - 1;
			if (countOfGumballs == 0) {
				System.out.println("Oops, out of gumballs!");
				state = SOLD_OUT;  //change state; machine is sold out
			} else {
				state = NO_QUARTER; //change state; ready for next quarter
			}
		//none of below should happen, but provide error in case
		} else if (state == NO_QUARTER) {
			System.out.println("You need to pay first");
		} else if (state == SOLD_OUT) {
			System.out.println("No gumball dispensed");
		} else if (state == HAS_QUARTER) {
			System.out.println("No gumball dispensed");
		}
	}

	//add to gumball count
	public void refill(int numGumBalls) {
		this.countOfGumballs = numGumBalls;
		state = NO_QUARTER;
	}

	//override Object toString()
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004\n");
		result.append("Inventory: " + countOfGumballs + " gumball");
		if (countOfGumballs != 1) {
			result.append("s");
		}
		result.append("\nMachine is ");
		if (state == SOLD_OUT) {
			result.append("sold out");
		} else if (state == NO_QUARTER) {
			result.append("waiting for quarter");
		} else if (state == HAS_QUARTER) {
			result.append("waiting for turn of crank");
		} else if (state == SOLD) {
			result.append("delivering a gumball");
		}
		result.append("\n");
		return result.toString();
	}
}


