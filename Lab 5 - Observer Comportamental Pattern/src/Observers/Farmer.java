package Observers;
import Observable.WeatherForecast;

public class Farmer implements Observer {
    
    private String name;
    private String cpr; // "Cadastro de Produtor Rural"
    
    public Farmer(String name, String cpr) {
        this.name = name;
        this.cpr = cpr;
    }

    public void update(WeatherForecast currentWeather) {

        if ((currentWeather.getMoisture() < 0.20 || currentWeather.getMoisture() > 0.70) && currentWeather.getRain() < 0.25 || currentWeather.getTemperature() > 33)
            System.out.println("It will be rough days, according to weather forecast...");
        else
            System.out.println("It's not perfect, but the weather isn't that bad!");
       
    }

    public String getCpr() {
        return cpr;
    }
    public void setCpr(String cpr) {
        this.cpr = cpr;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
  
}