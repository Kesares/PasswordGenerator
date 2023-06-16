package kesares.display.components;

import javax.swing.*;

public class Menu extends JMenu {

    public Menu(Factory factory) {
        for (JMenuItem menuItem : factory.menuItems) {
            this.add(menuItem);
        }
    }

    public static class Factory {

        private JMenuItem[] menuItems;

        public Factory menuItems(JMenuItem... menuItems) {
            if (menuItems.length == 0) throw new IllegalArgumentException("Menu items must contain at least one");
            this.menuItems = menuItems;
            return this;
        }

        public Menu create() {
            return new Menu(this);
        }
    }
}
