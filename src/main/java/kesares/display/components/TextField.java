package kesares.display.components;

import kesares.config.Config;

import javax.swing.*;
import java.awt.*;

public class TextField extends JTextField {

    public TextField(Builder builder) {
        this.setText(builder.text);
        this.setPreferredSize(builder.dimension);
        this.setBackground(builder.backgroundColor);
        this.setForeground(builder.foregroundColor);
    }

    public static class Builder {

        private String text;
        private final Dimension dimension = new Dimension(60, 20);
        private final Color backgroundColor = Config.TEXT_FIELD_BACKGROUND_COLOR;
        private final Color foregroundColor = Config.TEXT_FIELD_FOREGROUND_COLOR;

        public Builder text(String text) {
            this.text = text;
            return this;
        }

        public TextField build() {
            return new TextField(this);
        }
    }
}