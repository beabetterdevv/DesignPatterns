package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class CurrentConditionsDisplay implements Observer {

    private int temp;
    private int humidity;

    public CurrentConditionsDisplay(Subject weatherStation) {
        weatherStation.registerObserver(this);
    }

    @Override
    public void update(int temp, int humidity) {
        this.temp = temp;
        this.humidity = humidity;
        displayCurrent();
    }

    public void displayCurrent() {
        System.out.println("Current Temperature: " + temp);
        System.out.println("Current Humidity: " + humidity);
    }
}
