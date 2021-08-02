package edu.depaul.cdm.se450.patterns.command.classexample;


public class SimpleReportControl {

    //will hold our command
    Command slot;

    public SimpleReportControl() {}


    //this sets the command that the slot above will control
    public void setCommand(Command command) {
        slot = command;
    }

    //Called with the button is press.
    //Calls the execute method of the command in slot
    public void buttonWasPressed() {
        slot.execute();
    }
}
