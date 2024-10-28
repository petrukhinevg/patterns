package decorator;

import util.ColorUtil;

public class Task {
    public static void main(String[] args) {

        Developer developer = new JavaDeveloper();
        System.out.println(developer.makeJob());

        System.out.println("-".repeat(developer.makeJob().length()));

        Developer developer1 = new SeniorJavaDeveloper(new JavaDeveloper());
        System.out.println(developer1.makeJob());

        System.out.println("-".repeat(developer1.makeJob().length()));

        Developer developer2 = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
        System.out.println(developer2.makeJob());

        System.out.println("-".repeat(ColorUtil.cleanedMessage(developer2.makeJob()).length()));

    }
}
