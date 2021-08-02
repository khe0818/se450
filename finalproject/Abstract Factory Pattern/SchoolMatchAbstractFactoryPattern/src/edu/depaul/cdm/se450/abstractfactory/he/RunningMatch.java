package edu.depaul.cdm.se450.abstractfactory.he;

public class RunningMatch implements SchoolMatch {
	

	public Jumping doJumping(String jump) {
		
		return null;
		
	}


	public Running doRunning(String run) {
		if(run == null) {
			return null;
		}
		if(run.equalsIgnoreCase("OneHundredMeter")) {
			return  new OneHundredMeter();
		}
		else if(run.equalsIgnoreCase("FourHundredMeter")) {
			return  new FourHundredMeter();
		}
		else if(run.equalsIgnoreCase("EightHundredMeter")) {
			return  new EightHundredMeter();
		}
		else if(run.equalsIgnoreCase("FiveThousandMeter")) {
			return new FiveThousandMeter();
		}
		
		
		
		return null;
		
	}
	
}

