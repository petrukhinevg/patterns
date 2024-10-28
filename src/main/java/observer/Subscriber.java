package observer;

import util.ColorUtil;

public class Subscriber implements Observer {

    String name;

    public Subscriber(String name) {
        this.name = ColorUtil.blueColor + name + ColorUtil.resetColor;
    }

    public String getName() {
        return name;
    }

    @Override
    public void handleEvent(long temp, String windSpeed) {
        String message = buildEventMessage(temp, windSpeed);
        System.out.println(
                ColorUtil.blueColor + "-".repeat(ColorUtil.cleanedMessage(message).length())
                +"\n" + message + "\n"
                +ColorUtil.blueColor + "-".repeat(ColorUtil.cleanedMessage(message).length()));
    }

    private String buildEventMessage(long temp, String windSpeed) {
        return name + " received a weather update: " + temp + " degrees, " + windSpeed + " wind speed.";
    }

}
