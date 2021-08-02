package edu.depaul.cdm.se450.patterns.templatemethod.simplebarista;

public class Coffee {

	//recipe for making coffee
	void prepareRecipe() {
		boilWater();
		brewCoffeeGrinds();
		pourInCup();
		addSugarAndMilk();
	}

   // same method in Tea class
	public void boilWater() {
		System.out.println("Boiling water");
	}
 
	public void brewCoffeeGrinds() {
		System.out.println("Dripping Coffee through filter");
	}
 
	public void pourInCup() {
		System.out.println("Pouring into cup");
	}

    // same method in Tea class
	public void addSugarAndMilk() {
		System.out.println("Adding Sugar and Milk");
	}
}
