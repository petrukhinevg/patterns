package abstractfactory.banking;

import abstractfactory.interfaces.Tester;

public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA tester tests banking code.");
    }
}
