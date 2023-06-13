package kesares.display.components;

import javax.swing.*;
import java.awt.*;

public class Label extends JLabel {

    public Label(Factory factory) {
        this.setText(factory.text);
        this.setFont(
            new Font(
                factory.font,
                factory.fontStyle,
                factory.fontSize)
        );
    }

    public static class Factory {

        private String text;
        private String font = "Arial";
        private int fontStyle;
        private int fontSize;

        public Factory text(String text) {
            this.text = text;
            return this;
        }

        public Factory font(String font) {
            this.font = font;
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