package edu.depaul.cdm.se450.patterns.decorator.iteration1;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        DarkRoast darkRoast = new DarkRoast();
        System.out.println(darkRoast.getDescription());
        System.out.println("The cost is " + darkRoast.cost());

        Decaf decaf = new Decaf();
        System.out.println(decaf.getDescription());
        System.out.println("The cost is " + decaf.cost());

        HouseBlend houseBlend = new HouseBlend();
        System.out.println(houseBlend.getDescription());
        System.out.println("The cost is " + houseBlend.cost());

        Espresso espresso = new Espresso();
        System.out.println(espresso.getDescription());
        System.out.println("The cost is " + espresso.cost());

    }
}

