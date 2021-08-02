package edu.depaul.cdm.se450.patterns.adapter.duck2turkey;

import edu.depaul.cdm.se450.patterns.adapter.birds.Duck;
import edu.depaul.cdm.se450.patterns.adapter.birds.Turkey;

import java.util.Random;

public class DuckAdapter implements Turkey {
	Duck duck;
	Random rand;
 
	public DuckAdapter(Duck duck) {
		this.duck = duck;
		rand = new Random();
	}
    
	public void gobble() {
		duck.quack();
	}
  
	public void fly() {
		if (rand.nextInt(5)  == 0) {
		     duck.fly();
		}
	}
}
