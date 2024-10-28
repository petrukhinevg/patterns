package strategy.behavior;

public class FlySlow implements Flyable {


    @Override
    public void fly() {
        System.out.println("I fly slow...");
    }
}
