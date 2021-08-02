package edu.depaul.cdm.se450.patterns.facade;

public class Screen {
	String description;

	public Screen(String description) {
		this.description = description;
	}

	public void up() {
		System.out.println(description + " going up");
	}

	public void down() {
		System.out.println(description + " going down");
	}


	public String toString() {
		return description;
	}
}
