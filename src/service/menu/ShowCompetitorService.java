package service.menu;

import bean.Competitor;
import bean.Config;
import service.menu.inter.ShowCompetitorServiceInter;

public class ShowCompetitorService implements ShowCompetitorServiceInter {

    @Override
    public void process() {
        Competitor[] allStudents = Config.instance().getCompetitors();
        for (int i = 0; i < allStudents.length; i++) {
            System.out.println(allStudents[i]);
        }
    }

}
