package abstractfactory.website;

import abstractfactory.interfaces.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code.");
    }
}
