package edu.depaul.cdm.se450.patterns.command.classexample;

public class GarageOpenCommand implements Command{

    Garage garage;

    public GarageOpenCommand(Garage garage){
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.opendoor();
    }
}
