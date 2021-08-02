package edu.depaul.cdm.se450.patterns.decorator.iteration3;

public class StarbuzzCoffee {
    public static void main(String[] args) {
//        Beverage beverage = new Espresso();
//        System.out.println(beverage.getDescription() + " $" + beverage.cost());
//
//        Beverage hbSoyMocha = new HouseBlend();
//        hbSoyMocha = new Soy(hbSoyMocha);
//        hbSoyMocha = new Mocha(hbSoyMocha);
//        System.out.println(hbSoyMocha.getDescription() + " $" + hbSoyMocha.cost());

        Beverage drSoyMocha = new DarkRoast();
        drSoyMocha = new Soy(drSoyMocha);
        drSoyMocha = new Mocha(drSoyMocha);
        System.out.println(drSoyMocha.getDescription() + " $" + drSoyMocha.cost());
    }
}
