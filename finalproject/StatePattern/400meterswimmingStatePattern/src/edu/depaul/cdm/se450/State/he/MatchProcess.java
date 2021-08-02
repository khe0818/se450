package edu.depaul.cdm.se450.State.he;

public class MatchProcess {
	private State state;
	public MatchProcess() {
		state = null;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return state;
	}
}
