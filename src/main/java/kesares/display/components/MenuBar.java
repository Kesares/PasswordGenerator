package kesares.display.components;

import javax.swing.*;

public class MenuBar extends JMenuBar {

    public MenuBar(Factory factory) {
        for (String title : factory.titles) {
            this.add(new JMenu(title));
        }
    }

    public static class Factory {

        private String[] titles;

        public Factory titles(String... titles) {
            if (titles.length == 0) throw new IllegalArgumentException("Menu bar must have at least one submenu");
            this.titles = titles;
            return this;
        }

        public MenuBar create() {
            return new MenuBar(this);
        }
    }
}
