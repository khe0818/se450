package edu.depaul.cdm.se450.patterns.templatemethod.barista;


public class HotChocolate extends CaffeineBeverageWithHook {

    @Override
    void brew() {
        System.out.println("Mix chocolate");
    }

    @Override
    void addCondiments() {
        System.out.println("Add Marshmellows");
    }

}
