package abstractfactory;

import abstractfactory.banking.BankingTeamFactory;
import abstractfactory.interfaces.Developer;
import abstractfactory.interfaces.ProjectManager;
import abstractfactory.interfaces.ProjectTeamFactory;
import abstractfactory.interfaces.Tester;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();

        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating " + projectTeamFactory.getType().getName() + " application project...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
