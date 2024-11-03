package abstractfactory.website;

import abstractfactory.interfaces.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project.");
    }
}
