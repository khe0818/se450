package edu.depaul.cdm.se450.patterns.templatemethod.simplebarista;

public class Tea {


	void prepareRecipe() {
		boilWater();
		steepTeaBag();
		pourInCup();
		addLemon();
	}
    //same method we see in Coffee class
	public void boilWater() {
		System.out.println("Boiling water");
	}
 
	public void steepTeaBag() {
		System.out.println("Steeping the tea");
	}
 
	public void addLemon() {
		System.out.println("Adding Lemon");
	}

    //same method we see in Coffee class
	public void pourInCup() {
		System.out.println("Pouring into cup");
	}
}
