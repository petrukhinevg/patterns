package factory;

import util.ColorUtil;

public class JavaDeveloper implements Developer {

    private final String textMessage = "Write some " + ColorUtil.blueColor("Java") + " code... ";

    @Override
    public void writeCode() {
        System.out.println(textMessage);
    }
}
