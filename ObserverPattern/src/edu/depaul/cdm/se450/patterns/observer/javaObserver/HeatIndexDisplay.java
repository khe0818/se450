package edu.depaul.cdm.se450.patterns.observer.javaObserver;

import java.util.Observer;
import java.util.Observable;

public class HeatIndexDisplay implements Observer, DisplayElement {
    float heatIndex = 0.0f;
    private WeatherData weatherData;

    // save the reference to the weatherData object
    // and then use it to register this object as an observer
    public HeatIndexDisplay(Observable observable) {
        observable.addObserver(this);
    }

    // from Observer
    // saves the temp and humidity, pressure not needed for this display
    public void update(Observable observable, Object object) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            float t = weatherData.getTemperature();
            float rh = weatherData.getHumidity();
            heatIndex = computeHeatIndex(t, rh);
            //calls display to print out new values
            display();
        }
    }


    // takes in the temperature and humidity to calculate heatindex
    private float computeHeatIndex(float t, float rh) {
        float index = (float)
                (
                (16.923 + (0.185212 * t)) +
                (5.37941 * rh) -
                (0.100254 * t * rh) +
                (0.00941695 * (t * t)) +
                (0.00728898 * (rh * rh)) +
                (0.000345372 * (t * t * rh)) -
                (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) -
                (0.000038646 * (t * t * t)) +
                (0.0000291583 * (rh * rh * rh)) +
                (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) -
                (0.0000000218429 * (t * t * t * rh * rh)) +
                (0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        return index;
    }


    public void display() {
        System.out.println("Heat index is " + heatIndex);
    }
}