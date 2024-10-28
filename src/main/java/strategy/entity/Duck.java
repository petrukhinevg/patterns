package strategy.entity;

import strategy.behavior.Flyable;

public class Duck {

    Flyable flyable;

    public Duck(Flyable flyable) {
        this.flyable = flyable;
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public void fly() {
        flyable.fly();
    }

}
