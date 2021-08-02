package edu.depaul.cdm.se450.State.he;


public class Start implements State {
	public void Swimming(MatchProcess m) {
		System.out.println("player jump into water and start swimming");
		m.setState(this);
	}
	
 

}
