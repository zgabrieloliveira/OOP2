package Observable;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import Observers.Observer;

public class WeatherForecast implements Observable {
    
    protected ArrayList<Observer> observers = new ArrayList<Observer>();
    private int temperature; // celsius
    private float moisture; // percentage 
    private float rain; // percentage
    private float windVelocity;

    public WeatherForecast() {}

    public WeatherForecast(int temperature, float moisture, float rain, float windVelocity) {
        this.temperature = temperature;
        this.moisture = moisture;
        this.rain = rain;
        this.windVelocity = windVelocity;
    } 

    public void setState() {

        Random r = new Random();
        
        this.temperature = r.nextInt(40);
        this.moisture = r.nextInt(100);
        this.rain = r.nextInt(100);
        this.windVelocity = r.nextFloat(200);

    }

    public void getState() {
    
    }

    public void changeState() {

        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            public void run() {
                setState();
                notifyObservers();
            }
        }, 0, 10000); // update weather every 10sec
        
    }

    public void addObserver(Observer obs) {

        if (obs != null) {
            observers.add(obs);
            System.out.println("\n*Observer added!*\n");
        }
        else 
            System.out.println("\nSorry, observer not added...\n");     
            
    }

    public void removeObserver(Observer obs) {

        if (obs != null) {
            observers.remove(obs);
            System.out.println("\n*Observer removed!*\n");
        }
            
        else 
            System.out.println("\nSorry, observer could not get removed...");
    }

    public void notifyObservers() {
        
        for (Observer o : this.observers)
            o.update(this);

    }
    
    public ArrayList<Observer> getObservers() {
        return observers;
    }
    public void setObservers(ArrayList<Observer> observers) {
        this.observers = observers;
    }
    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public float getMoisture() {
        return moisture;
    }
    public void setMoisture(int moisture) {
        this.moisture = moisture;
    }
    public float getRain() {
        return rain;
    }
    public void setRain(int rain) {
        this.rain = rain;
    }
    public float getWindVelocity() {
        return windVelocity;
    }
    public void setWindVelocity(float windVelocity) {
        this.windVelocity = windVelocity;
    }

}