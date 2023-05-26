package Observers;

import java.time.LocalDate;
import Observable.WeatherForecast;

public class Journal implements Observer {

    private String name;
    private int foundationYear;
    
    public Journal(String name, int foundationYear) {
        this.name = name;
        this.foundationYear = foundationYear;
    }

    public void update(WeatherForecast currentWeather) {
        System.out.println("\nWEATHER FORECAST: " + LocalDate.now());
        System.out.println("TEMPERATURE: " + currentWeather.getTemperature());
        System.out.println("MOISTURE: " + currentWeather.getMoisture());
        System.out.println("RAIN: " + currentWeather.getRain());
        System.out.println("WIND VELOCITY: " + currentWeather.getWindVelocity() + "\n");
    }

    public int getFoundationYear() {
        return foundationYear;
    }
    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}