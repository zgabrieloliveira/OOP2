package Observers;

import Observable.WeatherForecast;

public class Airport implements Observer {

    private String name;
    private Boolean internacional;

    public Airport(String name, Boolean internacional) {
        this.name = name;
        this.internacional = internacional;
    }

    public void update(WeatherForecast currentWeather) {

        if (currentWeather.getWindVelocity() > 60)
            System.out.println("\nThe flights were CANCELED due the wind speed!");
        else
            System.out.println("\nThe current weather is SAFE for airplane flights!");

            System.out.println("By weather forecast, it will reach " + currentWeather.getWindVelocity() + "km/h\n");      
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Boolean getInternacional() {
        return internacional;
    }
    public void setInternacional(Boolean internacional) {
        this.internacional = internacional;
    }

}