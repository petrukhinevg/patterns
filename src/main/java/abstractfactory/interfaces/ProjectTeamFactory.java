package abstractfactory.interfaces;

import abstractfactory.util.AbstractFactoryType;

public interface ProjectTeamFactory {

    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();

    AbstractFactoryType getType();
}
