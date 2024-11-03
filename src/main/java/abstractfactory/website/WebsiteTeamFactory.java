package abstractfactory.website;

import abstractfactory.interfaces.Developer;
import abstractfactory.interfaces.ProjectManager;
import abstractfactory.interfaces.ProjectTeamFactory;
import abstractfactory.interfaces.Tester;
import abstractfactory.util.AbstractFactoryType;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }

    @Override
    public AbstractFactoryType getType() {
        return AbstractFactoryType.WEBAPP;
    }
}
