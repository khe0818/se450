package edu.depaul.cdm.se450.patterns.observer.javaObserver;

import java.util.Observer;
import java.util.Observable;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;
    /* private Subject weatherData; */

    /*
    save the reference to the weatherData object
    and then use it to register this object as an observer
    */
    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    /* from Observer */
    public void update(Observable observable, Object object) {
        if(observable instanceof WeatherData) {
            WeatherData weatherData = new WeatherData();
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            /* calls display to print out new values */
            display();
        }
    }

    /*
    from DisplayElement
    prints out temperature and humidity
    */
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
