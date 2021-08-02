package edu.depaul.cdm.se450.template.he;

public class ShoppingTest {
	public static void main(String[] args) {
		OrderProcess o1 = new OnlineShopping();
        o1.processOrder(true);
        o1.processOrder(false);
        OrderProcess o2 = new OnSiteShopping();
        o2.processOrder(false);
	}
}
