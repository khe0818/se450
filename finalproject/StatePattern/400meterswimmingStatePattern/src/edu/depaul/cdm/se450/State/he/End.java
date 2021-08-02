package edu.depaul.cdm.se450.State.he;



public class End implements State {
	public void Swimming(MatchProcess m) {
		System.out.println("player finish the swimming practice");
		m.setState(this);
	}
}
