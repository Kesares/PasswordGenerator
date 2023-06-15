package kesares.display.components;

import javax.swing.*;

public class MenuBar extends JMenuBar {

    public MenuBar(Factory factory) {
        for (Menu menu : factory.menus) {
            this.add(menu);
        }
    }

    public static class Factory {

        private Menu[] menus;

        public Factory menu(Menu... menus) {
            if (menus.length == 0) throw new IllegalArgumentException("Menus must at least ");
            this.menus = menus;
            return this;
        }

        public MenuBar create() {
            return new MenuBar(this);
        }
    }
}
