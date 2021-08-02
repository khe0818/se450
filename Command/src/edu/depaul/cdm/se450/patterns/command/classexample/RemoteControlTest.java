package edu.depaul.cdm.se450.patterns.command.classexample;


import java.lang.reflect.GenericArrayType;

//This class is our 'Client' as defined by the Command Pattern
public class RemoteControlTest {
    public static void main(String[] args) {

        //This is the Invoker.
        SimpleReportControl remote = new SimpleReportControl();

        //Receivers of the request
        Light light = new Light();
        Garage garage = new Garage();

        //Create a command and pass the Receiver to it.
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageOpenCommand goc = new GarageOpenCommand(garage);

        //Pass the command to the Invoker
        remote.setCommand(lightOn);
        remote.setCommand(goc);

        //this will call the execute method of the
        //LightOnCommand object that was passed into the
        //remote....buttonWasPressed will call the execute
        //method of the LightOnCommand
        remote.buttonWasPressed();

    }
}
