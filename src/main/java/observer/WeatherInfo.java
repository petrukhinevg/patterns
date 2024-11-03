package observer;

import util.ColorUtil;

import java.util.ArrayList;
import java.util.List;

public class WeatherInfo implements Subject {

    List<Observer> subscribers = new ArrayList<>();

    long temp;
    String windSpeed;
    String onUpdatedMassage;

    public void setWeatherData(long temp, String windSpeed) {
        this.temp = temp;
        this.windSpeed = windSpeed;

        this.onUpdatedMassage = ColorUtil.blackFont(ColorUtil.redColor("!!!")
            + ColorUtil.cursiveFont(" Weather data updated: " + temp + " degrees, " + windSpeed + " wind speed."));

        dataUpdated();
        notifyObservers();
    }


    @Override
    public void registerObserver(Observer observer) {
        this.subscribers.add(observer);
        System.out.println(ColorUtil.greenColor("New subscriber added: " + observer.getName()));
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
        System.out.println(ColorUtil.yellowColor("Subscriber removed: " + observer.getName()));
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.handleEvent(temp, windSpeed);
        }
    }

    private void dataUpdated() {
        System.out.println(onUpdatedMassage);
    }
}
