package edu.depaul.cdm.se450.patterns.observer.observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers;  //holds all observers

    private float temperature;
    private float humidity;
    private float pressure;

    //constructor will instantiate the ArrayList observers
    public WeatherData() {
        observers = new ArrayList<Observer>();
    }


    //adds observer to the ArrayList observers
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    //removes observer from the ArrayList observers
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    //how the weatherdata subject notifies all of its observers when a change occurs
    // and pass the class private variables temperature, humidity, pressure
    public void notifyObserver() {
        for (int i=0; i<observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }


    //this meathod allows the weather station needs to set values when new data is available
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    private void measurementsChanged() {
        notifyObserver();
        // we can do other stuff here if needed
    }

    //getter methods
    public float getTemperature(){
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
