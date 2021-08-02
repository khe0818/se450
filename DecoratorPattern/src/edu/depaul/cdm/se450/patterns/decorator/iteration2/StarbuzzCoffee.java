package edu.depaul.cdm.se450.patterns.decorator.iteration2;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        DarkRoast darkRoast = new DarkRoast();
        darkRoast.setMocha(true);
        darkRoast.setWhip(true);
        darkRoast.cost();
        System.out.println("the cost is " + darkRoast.cost());

    }
}

