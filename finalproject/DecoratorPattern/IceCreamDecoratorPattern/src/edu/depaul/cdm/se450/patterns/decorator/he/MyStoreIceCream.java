package edu.depaul.cdm.se450.patterns.decorator.he;

public class MyStoreIceCream {
	public static void main(String[] args) {
	        IceCream ic = new NormalIceCream();
	        System.out.println(ic.getDescription() + " $" + ic.cost());
	        
	        IceCream ic1 = new Gelato();
	        System.out.println(ic1.getDescription() + " $" + ic1.cost());
	        
	        IceCream ic2 = new FrozenYogurt();
	        System.out.println(ic2.getDescription() + " $" + ic2.cost());
	        
	        IceCream ic3 = new Sherbet();
	        System.out.println(ic3.getDescription() + " $" + ic3.cost());
	        
	        IceCream ic4 = new FriedIceCream();
	        System.out.println(ic4.getDescription() + " $" + ic4.cost());

	        IceCream ic5 = new NormalIceCream();
	        ic5 = new Fruits(ic5);
	        System.out.println(ic5.getDescription() + " $" + ic5.cost());
	        
	        IceCream ic6 = new Gelato();
	        ic6 = new Cookies(ic6);
	        ic6 = new CornFlakes(ic6);
	        System.out.println(ic6.getDescription() + " $" + ic6.cost());
	        
	        IceCream ic7 = new FrozenYogurt();
	        ic7 = new Cookies(ic7);
	        ic7 = new CornFlakes(ic7);
	        ic7 = new RainbowRice(ic7);
	        System.out.println(ic7.getDescription() + " $" + ic7.cost());
	    }

}
