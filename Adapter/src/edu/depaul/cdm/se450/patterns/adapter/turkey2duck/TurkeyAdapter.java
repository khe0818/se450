package edu.depaul.cdm.se450.patterns.adapter.turkey2duck;

import edu.depaul.cdm.se450.patterns.adapter.birds.Duck;
import edu.depaul.cdm.se450.patterns.adapter.birds.Turkey;

// This class is the adapter.  Use an adapter class
// that implement the type you want to be adapted to.
// Here the TurkeyAdapter is about making the Turkey
// adaptable with Duck.  Basically we need the turkey to
// work as a duck.
public class TurkeyAdapter implements Duck {
	Turkey turkey;

	//get the reference the turkey object. This is the concrete class
	// that we pass in but we use the reference of the interface.
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	//implement the duck interfaces quack and fly
	// quack will call turkey
	public void quack() {
		turkey.gobble();
	}
	// In order to meet basic duck flying standards
	// we call turkey's fly method 5 times.
	// In real code, we will probably not just substitute simple
	// methods, we may need a lot of code to 'adapt'
  	public void fly() {
		for(int i=0; i < 5; i++) {
			turkey.fly();
		}
	}
}
