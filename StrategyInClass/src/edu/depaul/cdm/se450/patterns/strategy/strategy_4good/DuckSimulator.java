package edu.depaul.cdm.se450.patterns.strategy.strategy_4good;

public class DuckSimulator {

    public static void main(String[] args) {

        // create a Mallard Duck
        Duck md = new MallardDuck();
        md.display();

        //we will pass the implementation via the set...behavior() methods.
        md.setflybehavior(new NormalFly());
        md.setquackbehavior(new RegularQuack());

        //performfly() and performquack() now will work for any child of Duck class.
        md.performfly();
        md.performquack();
        md.swim();

        System.out.println("\n");

        //Create a Redhead Duck
        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.setflybehavior(new NormalFly());
        redHeadDuck.setquackbehavior(new RegularQuack());
        redHeadDuck.performfly();
        redHeadDuck.performquack();
        redHeadDuck.swim();


        System.out.println("\n");

        //Create a Rubber duck
        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();

        //we can pass in concrete behaviors that we want
        // these are different behaviors than real ducks
        rubberDuck.setflybehavior(new FlyNoWay());
        rubberDuck.setquackbehavior(new SqueakQuack());

        //same methods all ducks will call.
        rubberDuck.performfly();
        rubberDuck.performquack();

        rubberDuck.swim();

        //now you create a Decoyduck and a Robotduck...
        //you'll have to create the classes and add behaviors.
        //What if your robot duck was jet powered?
        //what is decoyduck and rubberduck didn't swim, but only floated?

    }
}
