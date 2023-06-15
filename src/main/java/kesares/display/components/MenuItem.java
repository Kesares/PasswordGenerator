package kesares.display.components;

import javax.swing.*;

public class MenuItem extends JMenuItem {

    public MenuItem() {

    }

    public static class Factory {

        public MenuItem create() {
            return new MenuItem();
        }
    }
}