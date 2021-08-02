package edu.depaul.cdm.se450.abstractfactory.he;

public class MatchTest {
	 public static void main(String[] args) {
		 SchoolMatch s1 = Player.pickMatch("Running");
		 Running r1 = s1.doRunning("OneHundredMeter");
		 r1.run();
		 Running r2 = s1.doRunning("FourHundredMeter");
		 r2.run();
		 Running r3 = s1.doRunning("EightHundredMeter");
		 r3.run();
		 Running r4 = s1.doRunning("FiveThousandMeter");
		 r4.run();
		 SchoolMatch s2 = Player.pickMatch("Jumping");
		 Jumping j1 = s2.doJumping("StandingLeap");
		 j1.jump();
		 Jumping j2 = s2.doJumping("longJump");
		 j2.jump();
		 Jumping j3 = s2.doJumping("TripleJump");
		 j3.jump();
		 
	 
	 }
	 

}
