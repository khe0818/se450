package edu.depaul.cdm.se450.State.he;

public class SwimmingTest {
	public static void main(String[] args) {
		MatchProcess m = new MatchProcess();
		  Start s = new Start();
	      s.Swimming(m);
	      
	      TurningAround t = new TurningAround();
	      t.Swimming(m);

	      End end = new End();
	      end.Swimming(m);

	}
}
