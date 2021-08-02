package edu.depaul.cdm.se450.patterns.observer.observer;

public interface Observer {

    //subject will call this method in order to notify observer of a change
    void update(float temp, float humidity, float pressure);

}
