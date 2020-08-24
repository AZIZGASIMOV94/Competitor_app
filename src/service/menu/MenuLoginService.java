package service.menu;

import java.util.Scanner;
import service.menu.inter.MenuLoginServiceInter;

public class MenuLoginService implements MenuLoginServiceInter {

    private int count = 0;

    @Override
    public void process() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter username:");
        String username = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter password:");
        String password = sc2.nextLine();

        while (!(username.equals("aziz") && password.equals("12345"))) {
            count++;
            if (count == 3) {
                throw new IllegalArgumentException("user name or password is invalid!");
            } else {
                process();
            }
        }
    }

}
