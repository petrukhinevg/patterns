package strategy;

import strategy.behavior.FlyFast;
import strategy.behavior.FlySlow;
import strategy.behavior.Flyable;
import strategy.entity.Duck;

public class MainStrategyApp {

    public static void main(String[] args) {
        Flyable flyable = new FlySlow();

        Duck duck = new Duck(flyable);

        duck.fly();

        duck.setFlyable(new FlyFast());

        duck.fly();
    }
}
