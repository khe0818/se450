package edu.depaul.cdm.se450.patterns.strategy.he;

public class CatSimulator {
	   public static void main(String[] args) {

		   	Cat t = new Tiger();
	        t.display();

	        t.setroarbehavior(new Roar());
	        t.setclawability(new NormalStretch());

	        t.performRoar();
	        t.performClawStretch();
	        t.run();
	        
	        System.out.println("\n");
	    	Cat r = new Ragdoll();
	        r.display();

	        r.setroarbehavior(new NoRoar());
	        r.setclawability(new NormalStretch());

	        r.performRoar();
	        r.performClawStretch();
	        r.run();
	        
	        System.out.println("\n");
	    	Cat c = new Cheetah();
	        c.display();

	        c.setroarbehavior(new NoRoar());
	        c.setclawability(new NoStretch());

	        c.performRoar();
	        c.performClawStretch();
	        c.run();
	        System.out.println("\n");
	   }

	
}
