package edu.depaul.cdm.se450.patterns.adapter.turkey2duck;

import edu.depaul.cdm.se450.patterns.adapter.birds.Duck;
import edu.depaul.cdm.se450.patterns.adapter.birds.MallardDuck;
import edu.depaul.cdm.se450.patterns.adapter.birds.WildTurkey;


public class DuckTestDrive {
	public static void main(String[] args) {
	    //create a duck and turkey
		MallardDuck duck = new MallardDuck();
		WildTurkey turkey = new WildTurkey();

		//Use the turkeyAdapter to allow the turkey
        // to be of type Duck
		Duck turkeyAdapter = new TurkeyAdapter(turkey);

		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();

		System.out.println("\nThe Duck says...");
		testDuck(duck);

		System.out.println("\nThe TurkeyAdapter says...");
		testDuck(turkeyAdapter);
	}

	// This demonstrates turkey will work
    // with quack() and duck's fly()
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
