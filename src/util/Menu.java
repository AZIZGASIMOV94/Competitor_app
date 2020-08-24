package util;

import service.menu.inter.MenuService;

public enum Menu {
    LOGIN(),
    REGISTER(),
    LOGOUT(),
    EXIT(),
    UNKNOWN();

    private int number;
    private String label;
    private MenuService service;

    Menu() {

    }

    Menu(int number, String label, MenuService service) {
        this.label = label;
        this.service = service;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void process() {
        service.process();
    }

    @Override
    public String toString() {
        return number+" "+label;
    }
    
    public static Menu find(int number) {
        Menu menus[] = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i].getNumber() == number) {
                return menus[i];
            }
        }
        return Menu.UNKNOWN;
    }

    public static void shaowAllMenu() {
        Menu menus[] = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i] != UNKNOWN) {
                System.out.println(menus[i]);
            }
        }
    }
}
