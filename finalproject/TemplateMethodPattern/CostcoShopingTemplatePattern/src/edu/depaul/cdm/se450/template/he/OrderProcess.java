package edu.depaul.cdm.se450.template.he;



public abstract class OrderProcess {
	public boolean isPickup;
	public abstract void selectItem();
	public abstract void checkMembership();			
	public abstract void checkOut();

	public abstract void delivery();
	public void processOrder(boolean isPickup) {
		selectItem();
		if(isPickup) {
			System.out.println("pickup on site: please type in your pick up person name");
		}
		checkMembership();
		checkOut();
		delivery();
	}
	
}
