package abstractfactory.util;

import util.ColorUtil;

public enum AbstractFactoryType {

    WEBAPP(ColorUtil.blueColor("web")),
    BANKAPP(ColorUtil.blueColor("bank"));

    final String name;

    AbstractFactoryType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
