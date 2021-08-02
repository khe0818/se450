package edu.depaul.cdm.se450.patterns.observer.observer;

// Observable
public interface Subject {

    /** observers will call to register
     *   themselves with the subject
     */
    void registerObserver(Observer o);

    /** observers will call to remove
     *  themselves as observers
     */
    void removeObserver(Observer o);

    /** subject will call to notify
     * observers when there is a change
     */
    void notifyObserver();

}
