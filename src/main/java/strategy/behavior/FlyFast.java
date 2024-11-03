package strategy.behavior;

import util.ColorUtil;

public class FlyFast implements Flyable {


    @Override
    public void fly() {
        System.out.println(ColorUtil.redColor("See an enemy !!!"));
        System.out.println("I fly fast...");
    }
}
