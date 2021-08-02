package edu.depaul.cdm.se450.patterns.strategy.strategy_4good;

public abstract class Duck {

    FlyBehavior fb;
    QuackBehavior qb;

    //use composition for behaviors
    public void setflybehavior(FlyBehavior fb){
        this.fb = fb;
    }
    public void setquackbehavior(QuackBehavior qb){
        this.qb = qb;
    }

    public void performfly() {
        fb.fly();
    }
    public void performquack(){
        qb.quack();
    }


    public void swim(){
        System.out.println("I'm swimming");
    }
    public abstract void display();


}
