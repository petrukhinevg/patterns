package abstractfactory.banking;

import abstractfactory.interfaces.Developer;
import abstractfactory.interfaces.ProjectManager;
import abstractfactory.interfaces.ProjectTeamFactory;
import abstractfactory.interfaces.Tester;
import abstractfactory.util.AbstractFactoryType;

public class BankingTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }

    public AbstractFactoryType getType() {
        return AbstractFactoryType.BANKAPP;
    }
}
