package edu.depaul.cdm.se450.patterns.factories.nofactory;

import java.util.ArrayList;
/*
  We'll use an abstract class instead of an interface
  so that we can have pizza inherit the common methods
 */
public abstract class Pizza {

    String name;
    String dough;
    String sauce;

    //list of topping
    ArrayList<String> toppings = new ArrayList<String>();

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }

    // We'll override  Object toString()
    @Override
    public String toString() {
        // code to display pizza name and ingredients
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        display.append("----------------------\n");
        return display.toString();
    }
}
