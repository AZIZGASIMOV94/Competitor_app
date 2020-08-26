package service.menu;

import bean.Competitor;
import bean.Config;
import service.menu.inter.MenuShowCompetitorServiceInter;

public class ShowCompetitorService implements MenuShowCompetitorServiceInter {

    @Override
    public void process() {
        Competitor[] allCompetitors = Config.instance().getCompetitors();
        for (int i = 0; i < allCompetitors.length; i++) {
            System.out.println(allCompetitors[i]);
        }
    }
}
