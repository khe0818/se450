package edu.depaul.cdm.se450.patterns.decorator.iteration2;

public abstract class Beverage {

    public String description;
    private double cost;

    public String getDescription() {
        return "I'm a beverage";
    }

    private void setCost(double cost){
         this.cost += cost;
    }

    public double cost() {
        return cost;
    }

    //boolean values for each condiment
    private boolean milk;
    private boolean soy;
    private boolean mocha;
    private boolean whip;


    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
        setCost(.90);
    }

    public boolean isSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
        setCost(.50);
    }

    public boolean isMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
        setCost(1.00);
    }

    public boolean isWhip() {
        return whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
        setCost(.80);
    }







}
