package factory;

import util.ColorUtil;

public class CppDeveloper implements Developer {

    private final String textMessage = "Write some " + ColorUtil.blueColor("Cpp") + " code... ";

    @Override
    public void writeCode() {
        System.out.println(textMessage);
    }
}
