package decorator;

import util.ColorUtil;

public class JavaTeamLead extends DeveloperDecorator{

    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeedReport() {
        return "Smoke some "+ ColorUtil.greenColor("weed")+ " and send report... ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeedReport();
    }
}
