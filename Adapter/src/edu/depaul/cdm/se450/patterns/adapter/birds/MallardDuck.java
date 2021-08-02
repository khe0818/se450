package edu.depaul.cdm.se450.patterns.adapter.birds;

// Concrete Duck implementation
public class MallardDuck implements Duck {
	public void quack() {
		System.out.println("Quack");
	}
 
	public void fly() {
		System.out.println("I'm flying");
	}
}
