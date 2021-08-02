package edu.depaul.cdm.se450.patterns.command.classexample;


/*
    This class is used to turn on the light.  We implement
    the interface Command because this class needs to be a
    Command
 */
public class LightOnCommand implements Command{

    Light light;

    //We pass the a light object to the constructor
    public LightOnCommand(Light light) {
        this.light = light;
    }


    //This method will call on the on() method of the receiving object,
    // in this example, that would be the light
    @Override
    public void execute() {
        light.on();
    }


}
