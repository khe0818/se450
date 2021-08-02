package edu.depaul.cdm.se450.patterns.observer.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    // save the reference to the weatherData object
    // and then use it to register this object as an observer
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    // from Observer
    // saves the temp and humidity, pressure not needed for this display
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        //calls display to print out new values
        display();
    }

    //from DisplayElement
    // prints out temperature and humidity
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
