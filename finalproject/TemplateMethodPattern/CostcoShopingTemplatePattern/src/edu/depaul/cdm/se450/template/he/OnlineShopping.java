package edu.depaul.cdm.se450.template.he;

public class OnlineShopping extends OrderProcess {

	@Override
	public void selectItem() {
		System.out.println("selectItem(): select the item which want to buy");
		
	}

	@Override
	public void checkMembership() {
		System.out.println("checkMembership() : log in your account to verify membership");
		
	}

	@Override
	public void checkOut() {
		System.out.println("checkOut(): pay with your credit card or debit card");
		
	}

	@Override
	public void delivery() {
		System.out.println("delivery(): ship item to account saved address");
		
	}

}
