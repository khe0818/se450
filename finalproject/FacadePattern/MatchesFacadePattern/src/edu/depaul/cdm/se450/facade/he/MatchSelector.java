package edu.depaul.cdm.se450.facade.he;

public class MatchSelector {
	private Match Runner;
	private Match Jumper;
	private Match Swimmer;
	public MatchSelector() {
		Runner = new Running();
		Jumper = new Jumping();
		Swimmer = new Swimming();
	}
	 public void doRunning(){
	      Runner.run();
	   }
	   public void doJumping(){
	      Jumper.run();
	   }
	   public void doSwimming(){
	      Swimmer.run();
	   }

}
