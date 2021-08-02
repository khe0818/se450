package edu.depaul.cdm.se450.template.he;

public class OnSiteShopping extends OrderProcess{

	@Override
	public void selectItem() {
		System.out.println("selectItem() :pick up item into chart");
		
	}

	@Override
	public void checkMembership() {
		System.out.println("checkMembership(): hand in your membership card to cashier");
		
	}

	@Override
	public void checkOut() {
		System.out.println("checkOut(): please swipe your card or pay cash");
		
	}

	@Override
	public void delivery() {
		System.out.println("delivery(): take back your item and move to your cart");
		
	}

}
