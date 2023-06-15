package kesares.display.components;

import kesares.config.Config;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton {

    public Button(Factory factory) {
        this.setText(factory.text);
        this.setPreferredSize(factory.dimension);
        this.setBackground(factory.backgroundColor);
        this.setForeground(factory.foregroundColor);
    }

    public static class Factory {

        private String text;
        private Dimension dimension;
        private final Color backgroundColor = Config.BUTTON_BACKGROUND_COLOR;
        private final Color foregroundColor = Config.BUTTON_FOREGROUND_COLOR;

        public Factory text(String text) {
            this.text = text;
            return this;
        }

        public Factory dimension(Dimension dimension) {
            this.dimension = dimension;
            return this;
        }

        public Button create() {
            return new Button(this);
        }
    }
}
