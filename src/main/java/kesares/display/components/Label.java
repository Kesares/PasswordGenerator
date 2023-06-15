package kesares.display.components;

import kesares.config.Config;

import javax.swing.*;
import java.awt.*;

public class Label extends JLabel {

    public Label(Factory factory) {
        this.setText(factory.text);
        this.setForeground(factory.color);
        this.setFont(
            new Font(
                factory.font,
                factory.fontStyle,
                factory.fontSize)
        );
    }

    public static class Factory {

        private String text;
        private final Color color = Config.LABEL_COLOR;
        private String font = "Arial";
        private int fontStyle = Font.PLAIN;
        private int fontSize = 12;

        public Factory text(String text) {
            this.text = text;
            return this;
        }

        public Factory fontStyle(int fontStyle) {
            this.fontStyle = fontStyle;
            return this;
        }

        public Factory fontSize(int fontSize) {
            this.fontSize = fontSize;
            return this;
        }

        public Label create() {
            return new Label(this);
        }
    }
}