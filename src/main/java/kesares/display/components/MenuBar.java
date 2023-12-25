package kesares.display.components;

import javax.swing.*;

public class MenuBar extends JMenuBar {

    public MenuBar(Builder builder) {
        for (Menu menu : builder.menus) {
            this.add(menu);
        }
    }

    public static class Builder {

        private Menu[] menus;

        public Builder menu(Menu... menus) {
            if (menus.length == 0) throw new IllegalArgumentException("Menus must contain at least one");
            this.menus = menus;
            return this;
        }

        public MenuBar build() {
            return new MenuBar(this);
        }
    }
}
