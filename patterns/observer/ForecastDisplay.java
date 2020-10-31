package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ForecastDisplay implements Observer {

    private List<Integer> tempHistory;
    private List<Integer> humidityHistory;

    public ForecastDisplay(Subject weatherStation) {
        tempHistory = new ArrayList<>();
        humidityHistory = new ArrayList<>();
        weatherStation.registerObserver(this);
    }

    @Override
    public void update(int temp, int humidity) {
        this.tempHistory.add(temp);
        this.humidityHistory.add(temp);
        display7DayHistory();
    }

    public void display7DayHistory() {
        //Print Last 7 days History of Temperature and Humidity
        System.out.println("Temperature History: " +
                tempHistory.subList(Math.max(tempHistory.size() - 7, 0), tempHistory.size()));
        System.out.println("Humidity History: " +
                humidityHistory.subList(Math.max(humidityHistory.size() - 7, 0), humidityHistory.size()));

    }
}
