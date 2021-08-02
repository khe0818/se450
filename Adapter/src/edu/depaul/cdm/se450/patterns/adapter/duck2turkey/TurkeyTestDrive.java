package edu.depaul.cdm.se450.patterns.adapter.duck2turkey;

import edu.depaul.cdm.se450.patterns.adapter.birds.MallardDuck;
import edu.depaul.cdm.se450.patterns.adapter.birds.Turkey;

public class TurkeyTestDrive {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		Turkey duckAdapter = new DuckAdapter(duck);
 
		for(int i=0;i<10;i++) {
			System.out.println("The DuckAdapter says...");
			duckAdapter.gobble();
			duckAdapter.fly();
		}
	}
}
