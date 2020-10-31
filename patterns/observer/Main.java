package patterns.observer;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        //Create the data object (publisher / topic)
        WeatherStation weatherStation = new WeatherStation();

        //Create and register our displays (observers / subscribers)
        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherStation);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherStation);

        //Simulate updates
        for (int i = 0; i < 5; i++) {
            System.out.println("\n--- Update " + i + " ---");

            int randomTemp = getRandomint(-50, 40);
            int randomHumidity = getRandomint(0, 100);

            weatherStation.measurementsChanged(randomTemp, randomHumidity);

            Thread.sleep(1000);
        }
    }

    private static int getRandomint(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max + 1 - min) + min;
    }
}
