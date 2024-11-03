package abstractfactory.banking;

import abstractfactory.interfaces.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java Developer writes java code.");
    }
}
