package service.menu;

import bean.Competitor;
import bean.Config;
import java.util.Scanner;
import service.menu.inter.MenuAddCompetitorServiceInter;

/**
 *
 * @author azizg
 */
public class MenuAddCompetitorService implements MenuAddCompetitorServiceInter {

    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("add name ");
        String name = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("add surname ");
        String surname = sc2.nextLine();

        Competitor c = new Competitor();
        c.setName(name);
        c.setSurname(surname);

        Config.instance().appendCompetitor(c);
        System.out.println("added succesfully");
    }
}
