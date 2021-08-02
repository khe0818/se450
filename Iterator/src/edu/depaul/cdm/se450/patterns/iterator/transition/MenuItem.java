package edu.depaul.cdm.se450.patterns.iterator.transition;

/**
   A MenuItem consists of a
    name, desc, vegetarian flag, and price.
   All the values are passed to the constructor
    when the object is instantiated.
 */
public class MenuItem {
	private String name;
	private String description;
	private boolean vegetarian;
	private double price;


	public MenuItem(String name, 
	                String description, 
	                boolean vegetarian, 
	                double price) 
	{
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	//getter methods for private attributes
	public String getName() {
		return name;
	}
  
	public String getDescription() {
		return description;
	}
  
	public double getPrice() {
		return price;
	}
  
	public boolean isVegetarian() {
		return vegetarian;
	}
}
