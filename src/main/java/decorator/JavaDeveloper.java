package decorator;

import util.ColorUtil;

public class JavaDeveloper implements Developer {
    @Override
    public String makeJob() {
        return "Write some code... ";
    }
}
