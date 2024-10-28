package observer;

public class MainObserverApp {

    public static void main(String[] args) {
        WeatherInfo weatherInfo = new WeatherInfo();

        Subscriber subscriber1 = new Subscriber("Subscriber 1");
        Subscriber subscriber2 = new Subscriber("Subscriber 2");

        weatherInfo.registerObserver(subscriber1);
        weatherInfo.registerObserver(subscriber2);

        weatherInfo.setWeatherData(10, "10 m/s");

        weatherInfo.removeObserver(subscriber1);

        weatherInfo.setWeatherData(30, "30 m/s");
    }
}
