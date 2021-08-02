package edu.depaul.cdm.se450.patterns.observer.javaObserver;

import java.util.Observer;
import java.util.Observable;

public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    // save the reference to the weatherData object
    // and then use it to register this object as an observer
    public ForecastDisplay(Observable observable) {
    //this.weatherData = weatherData;
    //weatherData.registerObserver(this);
        observable.addObserver(this);
    }

    //updates only pressure
    //    public void update(float temp, float humidity, float pressure) {
    //        lastPressure = currentPressure;
    //        currentPressure = pressure;
    //
    //        display();
    //    }

    public void update(Observable observable, Object object) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)observable;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

    // from DisplayElement
    // prints out Forecast based on change in pressure
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}