package edu.depaul.cdm.se450.patterns.strategy.strategy_1bad;

public class DuckSimulator {

    public static void main(String[] args) {

        //create Mallard duck
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.fly();

        //create Redhead duck
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.fly();
        redHeadDuck.swim();

    }

}
