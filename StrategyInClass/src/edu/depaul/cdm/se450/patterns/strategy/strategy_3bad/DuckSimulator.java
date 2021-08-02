package edu.depaul.cdm.se450.patterns.strategy.strategy_3bad;

public class DuckSimulator {

    public static void main(String[] args) {
        MallardDuck md = new MallardDuck();
        md.display();
        md.quack();
        md.swim();
        md.fly();

        System.out.println("\n");
        RedHeadDuck rd = new RedHeadDuck();
        rd.display();
        rd.quack();
        rd.swim();
        rd.fly();

        System.out.println("\n");
        RubberDuck rubberd = new RubberDuck();
        rubberd.display();
        rubberd.quack();
        rubberd.swim();
        rubberd.fly();


    }
}
