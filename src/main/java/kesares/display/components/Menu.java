package kesares.display.components;

import javax.swing.*;

public class Menu extends JMenu {

    public Menu(Builder builder) {
        for (JMenuItem menuItem : builder.menuItems) {
            this.add(menuItem);
        }
    }

    public static class Builder {

        private JMenuItem[] menuItems;

        public Builder menuItems(JMenuItem... menuItems) {
            if (menuItems.length == 0) throw new IllegalArgumentException("Menu items must contain at least one");
            this.menuItems = menuItems;
            return this;
        }

        public Menu build() {
            return new Menu(this);
        }
    }
}
