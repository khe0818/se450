package edu.depaul.cdm.se450.State.he;


public class TurningAround implements State {
	
	private int count = 0; 
	public void Swimming(MatchProcess m) {
		while(count++ != 6) {
			System.out.println("player touch wall and turn body around");
			System.out.println("player passing turnning point " + count);
			m.setState(this);
		}
	}

}
