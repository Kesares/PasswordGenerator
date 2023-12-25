package kesares.display.components;

import kesares.config.Config;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton {

    public Button(Builder builder) {
        this.setText(builder.text);
        this.setPreferredSize(builder.dimension);
        this.setBackground(builder.backgroundColor);
        this.setForeground(builder.foregroundColor);
    }

    public static class Builder {

        private String text;
        private Dimension dimension;
        private final Color backgroundColor = Config.BUTTON_BACKGROUND_COLOR;
        private final Color foregroundColor = Config.BUTTON_FOREGROUND_COLOR;

        public Builder text(String text) {
            this.text = text;
            return this;
        }

        public Builder dimension(Dimension dimension) {
            this.dimension = dimension;
            return this;
        }

        public Button build() {
            return new Button(this);
        }
    }
}
