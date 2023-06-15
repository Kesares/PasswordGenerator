package kesares.display.components;

import kesares.config.Config;

import javax.swing.*;
import java.awt.*;

public class TextField extends JTextField {

    public TextField(Factory factory) {
        this.setText(factory.text);
        this.setPreferredSize(factory.dimension);
        this.setBackground(factory.backgroundColor);
        this.setForeground(factory.foregroundColor);
    }

    public static class Factory {

        private String text;
        private final Dimension dimension = new Dimension(60, 20);
        private final Color backgroundColor = Config.TEXT_FIELD_BACKGROUND_COLOR;
        private final Color foregroundColor = Config.TEXT_FIELD_FOREGROUND_COLOR;

        public Factory text(String text) {
            this.text = text;
            return this;
        }

        public TextField create() {
            return new TextField(this);
        }
    }
}