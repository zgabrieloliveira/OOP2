package Observers;

import Observable.WeatherForecast;

public interface Observer {
    void update(WeatherForecast currentWeather);
    String getName();
    String toString();
}
