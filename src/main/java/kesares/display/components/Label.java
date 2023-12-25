package kesares.display.components;

import kesares.config.Config;

import javax.swing.*;
import java.awt.*;

public class Label extends JLabel {

    public Label(Builder builder) {
        this.setText(builder.text);
        this.setForeground(builder.color);
        this.setFont(
            new Font(
                builder.font,
                builder.fontStyle,
                builder.fontSize)
        );
    }

    public static class Builder {

        private String text;
        private final Color color = Config.LABEL_COLOR;
        private final String font = "Arial";
        private int fontStyle = Font.PLAIN;
        private int fontSize = 12;

        public Builder text(String text) {
            this.text = text;
            return this;
        }

        public Builder fontStyle(int fontStyle) {
            this.fontStyle = fontStyle;
            return this;
        }

        public Builder fontSize(int fontSize) {
            this.fontSize = fontSize;
            return this;
        }

        public Label build() {
            return new Label(this);
        }
    }
}