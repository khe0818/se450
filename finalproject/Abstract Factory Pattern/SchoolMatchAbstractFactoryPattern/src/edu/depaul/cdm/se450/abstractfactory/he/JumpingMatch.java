package edu.depaul.cdm.se450.abstractfactory.he;

public class JumpingMatch implements SchoolMatch {

	
	public Running doRunning(String run) {
		
		return null;
		
	}

	
	public Jumping doJumping(String jump) {
		if(jump == null) {
			return null;
		}
		if(jump.equalsIgnoreCase("StandingLeap")) {
			return new StandingLeap();
		}
		else if(jump.equalsIgnoreCase("longJump")) {
			return  new longJump();
		}
		else if(jump.equalsIgnoreCase("TripleJump")) {
			return  new TripleJump();
		}
		
		
		
		
		return null;
		
	}


}
