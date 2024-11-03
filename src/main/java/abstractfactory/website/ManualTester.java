package abstractfactory.website;

import abstractfactory.interfaces.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual Tester tests website.");
    }
}
