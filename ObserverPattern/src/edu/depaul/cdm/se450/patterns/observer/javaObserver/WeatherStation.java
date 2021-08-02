package edu.depaul.cdm.se450.patterns.observer.javaObserver;

public class WeatherStation {

    public static void main(String[] args) {

        //create the subject
        WeatherData weatherData = new WeatherData();

        //create the observers
        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

    }
}
