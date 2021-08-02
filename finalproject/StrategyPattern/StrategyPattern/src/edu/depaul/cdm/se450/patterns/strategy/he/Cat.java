package edu.depaul.cdm.se450.patterns.strategy.he;


public abstract class Cat {
	private RoarBehavior rb;
	private ClawAbility ca;
	
    public void setroarbehavior(RoarBehavior rb){
        this.rb = rb;
    }
    public void setclawability(ClawAbility ca) {
    	this.ca = ca;
    }

    public void performRoar() {
        rb.roar();
    }

    public void performClawStretch() {
    	ca.stretch();
    }

    public void run(){
        System.out.println("I'm a runner");
    }
    public abstract void display();

}
